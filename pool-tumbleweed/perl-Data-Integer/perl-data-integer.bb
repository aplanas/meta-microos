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

RPM_NAME = "perl-Data-Integer-0.006-1.20.noarch.rpm"
RPM_HASH = "d3d4fadad7166fc3c7f8fcb52b28d904582a49da79edccb9550bfff4aaa6a89e21e8c8d9d3f95d89b650b3d0950399ee2d9f4524c285a42ca452fbe2a526cce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Integer) \
perl-Data-Integer"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(parent)"

inherit rpm
