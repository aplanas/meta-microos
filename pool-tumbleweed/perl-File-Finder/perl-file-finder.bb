SUMMARY = "nice wrapper for File::Find ala find(1)"
DESCRIPTION = "'File::Find' is great, but constructing the 'wanted' routine can sometimes \
be a pain. This module provides a 'wanted'-writer, using syntax that is \
directly mappable to the _find_ command's syntax. \
 \
Also, I find myself (heh) frequently just wanting the list of names that \
match. With 'File::Find', I have to write a little accumulator, and then \
access that from a closure. But with 'File::Finder', I can turn the problem \
inside out. \
 \
A 'File::Finder' object contains a hash of 'File::Find' options, and a \
series of steps that mimic _find_'s predicates. Initially, a 'File::Finder' \
object has no steps. Each step method clones the previous object's options \
and steps, and then adds the new step, returning the new object. In this \
manner, an object can be grown, step by step, by chaining method calls. \
Furthermore, a partial sequence can be created and held, and used as the \
head of many different sequences. \
 \
For example, a step sequence that finds only files looks like: \
 \
  my $files = File::Finder->type('f'); \
 \
Here, 'type' is acting as a class method and thus a constructor. An \
instance of 'File::Finder' is returned, containing the one step to verify \
that only files are selected. We could use this immediately as a \
'File::Find::find' wanted routine, although it'd be uninteresting: \
 \
  use File::Find; \
  find($files, '/tmp'); \
 \
Calling a step method on an existing object adds the step, returning the \
new object: \
 \
  my $files_print = $files->print; \
 \
And now if we use this with 'find', we get a nice display: \
 \
  find($files_print, '/tmp'); \
 \
Of course, we didn't really need that second object: we could have \
generated it on the fly: \
 \
  find($files->print, '/tmp'); \
 \
'File::Find' supports options to modify behavior, such as depth-first \
searching. The 'depth' step flags this in the options as well: \
 \
  my $files_depth_print = $files->depth->print; \
 \
However, the 'File::Finder' object needs to be told explictly to generate \
an options hash for 'File::Find::find' to pass this information along: \
 \
  find($files_depth_print->as_options, '/tmp'); \
 \
A 'File::Finder' object, like the _find_ command, supports AND, OR, NOT, \
and parenthesized sub-expressions. AND binds tighter than OR, and is also \
implied everywhere that it makes sense. Like _find_, the predicates are \
computed in a 'short-circuit' fashion, so that a false to the left of the \
(implied) AND keeps the right side from being evaluated, including entire \
parenthesized subexpressions. Similarly, if the left side of an OR is \
false, the right side is evaluated, and if the left side of the OR is true, \
the right side is skipped. Nested parens are handled properly. Parens are \
indicated with the rather ugly 'left' and 'right' methods: \
 \
  my $big_or_old_files = $files->left->size('+50')->or->atime('+30')->right; \
 \
The parens here correspond directly to the parens in: \
 \
  find somewhere -type f '(' -size +50 -o -atime +30 ')' \
 \
and are needed so that the OR and the implied ANDs have the right nesting. \
 \
Besides passing the constructed 'File::Finder' object to \
'File::Finder::find' directly as a 'wanted' routine or an options hash, you \
can also call 'find' implictly, with 'in'. 'in' provides a list of starting \
points, and returns all filenames that match the criteria. \
 \
For example, a list of all names in /tmp can be generated simply with: \
 \
 my @names = File::Finder->in('/tmp'); \
 \
For more flexibility, use 'collect' to execute an arbitrary block in a list \
context, concatenating all the results (similar to 'map'): \
 \
  my %sizes = File::Finder \
    ->collect(sub { $File::Find::name => -s _ }, '/tmp'); \
 \
That's all I can think of for now. The rest is in the detailed reference \
below."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.53"

RPM_NAME = "perl-File-Finder-0.53-1.23.noarch.rpm"
RPM_HASH = "60947df4083a42a000b04b5e462c779bbf6a3c5dff522794b9312e78bc4c4993965236fe1098c7b67e2111b742c9ee36ec8bd5defa714140eaee98872d79959c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Finder) \
perl(File::Finder::Steps) \
perl-File-Finder"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More) \
perl(Text::Glob)"

inherit rpm
