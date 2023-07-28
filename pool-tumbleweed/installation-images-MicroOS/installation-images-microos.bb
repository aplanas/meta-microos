SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-MicroOS-17.89-1.56.aarch64.rpm"
RPM_HASH = "f8cf2fe61b7a866da22cdb30662d70791a5a7b0d1dc8cccad529a4f864a8de527caafbb556acaf8da1586fb031f36eda91f990d0cfe6691523d028c59daac48b"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
