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

RPM_NAME = "perl-Data-Integer-0.006-1.21.noarch.rpm"
RPM_HASH = "6cf875f9e2a7283c99ab24fb9f1cb6ff50fccd41e9732250a574c307aa6a782ea2bdb6600df39f3c6033ff4f231a18c03cecde369e9c589df0ed65f947f4f8b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Integer \
perl-Data-Integer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
