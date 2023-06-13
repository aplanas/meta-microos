SUMMARY = "Higher-order list utility functions"
DESCRIPTION = "This module provides a number of list utility functions, all of which take \
an initial code block to control their behaviour. They are variations on \
similar core perl or 'List::Util' functions of similar names, but which use \
the block to control their behaviour. For example, the core Perl function \
'sort' takes a list of values and returns them, sorted into order by their \
string value. The sort_by function sorts them according to the string value \
returned by the extra function, when given each value. \
 \
   my @names_sorted = sort @names; \
 \
   my @people_sorted = sort_by { $_->name } @people;"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.12"

RPM_NAME = "perl-List-UtilsBy-0.12-1.6.noarch.rpm"
RPM_HASH = "61bd2ab398406569651da34a57aa839ee86876fc33303f86186ea998ff34b695d524a2f74f95dbafb511602620b9f381f088e31828a46b8cffa2daafce5d2f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(List::UtilsBy) \
perl-List-UtilsBy"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
