SUMMARY = "An implementation of the Brew edit distance"
DESCRIPTION = "This module implements the Brew edit distance that is very close to the \
dynamic programming technique used for the Wagner-Fischer (and so for the \
Levenshtein) edit distance. Please look at the module references below. For \
more information about the Brew edit distance see: \
<http://ling.ohio-state.edu/~cbrew/795M/string-distance.html> \
 \
The difference here is that you have separated costs for the DELetion and \
INSertion operations (but with the default to 1 for both, you obtain the \
Levenshtein edit distance). But the most interesting feature is that you \
can obtain the description of the edits needed to transform the first \
string into the second one (not vice versa: here DELetions are separated \
from INSertions). The difference from the original algorithm by Chris Brew \
is that I have added the SUBST operation, making it different from MATCH \
operation. \
 \
The symbols used here are: \
 \
 INITIAL that is the INITIAL operation (i.e. NO operation) \
 MATCH	 that is the MATCH operation (0 is the default cost) \
 SUBST	 that is the SUBSTitution operation (1 is the default cost) \
 DEL	 that is the DELetion operation (1 is the default cost) \
 INS	 that is the INSertion operation (1 is the default cost) \
 \
and you can change the default costs (see below). \
 \
You can make INS and DEL the same operation in a simple way: \
 \
 1) give both the same cost \
 2) change the output string DEL to INS/DEL (o whatever) \
 3) change the output string INS to INS/DEL (o whatever)"
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Text-Brew-0.02-3.26.noarch.rpm"
RPM_HASH = "002a583f05ae41071934471282e205bff0e3f33d3a8f10033a80728e4974ecd385b0443abcd5e49d44b9f63b3ba4eb1652fc0f16df0f312b694531e62ca6c493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Brew) \
perl-Text-Brew"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
