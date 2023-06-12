SUMMARY = "Development files for ibus-anthy"
DESCRIPTION = "The ibus-anthy-devel package includes the header files for the ibus-anthy package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.14"

RPM_NAME = "ibus-anthy-devel-1.5.14-1.6.aarch64.rpm"
RPM_HASH = "ca489495ad09da816af8877fb2cad161f27c539c96b8311fe2db21c60ca8061efb00f210ccb6cfc4ef1dc7a9d77e6486365f936b0992d422605261695edf90d0"

RPROVIDES:${PN} += "ibus-anthy-devel \
ibus-anthy-devel(aarch-64)"
RDEPENDS:${PN} += "ibus-anthy"

inherit rpm
