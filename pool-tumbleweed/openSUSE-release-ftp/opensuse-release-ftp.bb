SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-ftp-20230707-1726.1.aarch64.rpm"
RPM_HASH = "e6c749206209546d16af80b55b6379fcbeeb08d0b83166f6ef3f896a12805547d1c4365c300867353a3532e5657ed29b0bebd4e68daf8ce4b94bdb12daf020de"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
