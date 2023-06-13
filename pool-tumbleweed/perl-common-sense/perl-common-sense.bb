SUMMARY = "Save a tree AND a kitten, use common::sense!"
DESCRIPTION = "   “Nothing is more fairly distributed than common sense: no one thinks \
   he needs more of it than he already has.” \
 \
   – René Descartes \
 \
This module implements some sane defaults for Perl programs, as defined by \
two typical (or not so typical - use your common sense) specimens of Perl \
coders. In fact, after working out details on which warnings and strict \
modes to enable and make fatal, we found that we (and our code written so \
far, and others) fully agree on every option, even though we never used \
warnings before, so it seems this module indeed reflects a 'common' sense \
among some long-time Perl coders. \
 \
The basic philosophy behind the choices made in common::sense can be \
summarised as: 'enforcing strict policies to catch as many bugs as \
possible, while at the same time, not limiting the expressive power \
available to the programmer'. \
 \
Two typical examples of how this philosophy is applied in practise is the \
handling of uninitialised and malloc warnings: \
 \
* _uninitialised_ \
 \
'undef' is a well-defined feature of perl, and enabling warnings for using \
it rarely catches any bugs, but considerably limits you in what you can do, \
so uninitialised warnings are disabled. \
 \
* _malloc_ \
 \
Freeing something twice on the C level is a serious bug, usually causing \
memory corruption. It often leads to side effects much later in the program \
and there are no advantages to not reporting this, so malloc warnings are \
fatal by default. \
 \
Unfortunately, there is no fine-grained warning control in perl, so often \
whole groups of useful warnings had to be excluded because of a single \
useless warning (for example, perl puts an arbitrary limit on the length of \
text you can match with some regexes before emitting a warning, making the \
whole 'regexp' category useless). \
 \
What follows is a more thorough discussion of what this module does, and \
why it does it, and what the advantages (and disadvantages) of this \
approach are."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "3.75"

RPM_NAME = "perl-common-sense-3.75-1.13.aarch64.rpm"
RPM_HASH = "12ce618a907040c1e954dbf44ebed3c711a4d13bb93b20b049a0431f5e7effb9144f26ab570939ea1046ef12091e1cf607c777994c45606ce11ce83fc96b8c4a"

RPROVIDES:${PN} += "perl(common::sense) \
perl-common-sense \
perl-common-sense(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
