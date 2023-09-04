SUMMARY = "Details of the Native Integer Data Type"
DESCRIPTION = "This module is about the native integer numerical data type. A native \
integer is one of the types of datum that can appear in the numeric part of \
a Perl scalar. This module supplies constants describing the native integer \
type. \
 \
There are actually two native integer representations: signed and unsigned. \
Both are handled by this module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-Data-Integer-0.006-1.22.noarch.rpm"
RPM_HASH = "681229829ad3d4886b053c0ed9c90b57d02371f4d5bb67e86dc5ac1632c493a5a216f6089aa5766fe1ef949198e1030ac0d384aea0ba9eb7a4cc19aebdda2ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Integer \
perl-Data-Integer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
