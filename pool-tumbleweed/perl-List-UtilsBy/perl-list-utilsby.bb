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

RPM_NAME = "perl-List-UtilsBy-0.12-1.8.noarch.rpm"
RPM_HASH = "22a65aa621a73261e9972c981b5f7d862db811cc0de23871e67039d2d29548e0de18cda71cc1890c337b58ec4118ffb95d36a1643ab6fe36ae072eeb8bd139fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--UtilsBy \
perl-List-UtilsBy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
