SUMMARY = "Assemble multiple Regular Expressions into a single RE"
DESCRIPTION = "Regexp::Assemble takes an arbitrary number of regular expressions and \
assembles them into a single regular expression (or RE) that matches all \
that the individual REs match. \
 \
As a result, instead of having a large list of expressions to loop over, a \
target string only needs to be tested against one expression. This is \
interesting when you have several thousand patterns to deal with. Serious \
effort is made to produce the smallest pattern possible. \
 \
It is also possible to track the original patterns, so that you can \
determine which, among the source patterns that form the assembled pattern, \
was the one that caused the match to occur. \
 \
You should realise that large numbers of alternations are processed in \
perl's regular expression engine in O(n) time, not O(1). If you are still \
having performance problems, you should look at using a trie. Note that \
Perl's own regular expression engine will implement trie optimisations in \
perl 5.10 (they are already available in perl 5.9.3 if you want to try them \
out). 'Regexp::Assemble' will do the right thing when it knows it's running \
on a trie'd perl. (At least in some version after this one). \
 \
Some more examples of usage appear in the accompanying README. If that file \
is not easy to access locally, you can find it on a web repository such as \
http://search.cpan.org/dist/Regexp-Assemble/README or \
http://cpan.uwinnipeg.ca/htdocs/Regexp-Assemble/README.html. \
 \
See also LIMITATIONS."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.38"

RPM_NAME = "perl-Regexp-Assemble-0.38-1.21.noarch.rpm"
RPM_HASH = "3faa6c7e5d0817f3d3c41b4a7c14d3389ec413ae53fada9320675f7c97ca02121915a624ee6d5327ba935c87b85e129c35be07b3a8f294b98e6cfdd6b902b711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--Assemble \
perl-Regexp-Assemble"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
