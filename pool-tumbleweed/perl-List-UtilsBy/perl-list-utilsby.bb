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

RPM_NAME = "perl-List-UtilsBy-0.12-1.7.noarch.rpm"
RPM_HASH = "a8aa907ec176599c288ef1c8b4fc4cd9dce9f4459db1e68296861f4d094bf79d46a6d5f403c67e132efa109a56a617efa9a3ae7dbe9200a14e9e6239cf0ed84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--UtilsBy \
perl-List-UtilsBy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
