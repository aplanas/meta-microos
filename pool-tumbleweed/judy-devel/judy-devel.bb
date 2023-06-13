SUMMARY = "Development files for Judy"
DESCRIPTION = "This package holds the development files for Judy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "judy-devel-1.0.5-10.12.aarch64.rpm"
RPM_HASH = "a6f87327f225582d44845aeaa58d16f2fd1f945dce3ab90cacec06bbb183f6eb344d104cc1431d1ca62c07c5903ad0ea8ee622aa8b266c4f85bbae86b694b721"

RPROVIDES:${PN} += "judy-devel \
judy-devel(aarch-64)"

RDEPENDS:${PN} += "libJudy1"

inherit rpm
