SUMMARY = "Development files for libmsym"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "libmsym-devel-0.2.3-2.6.aarch64.rpm"
RPM_HASH = "6afc1708d78c4b746e0d7fc9f4ab97b6940b961f369c70bca3820ef8dc228db5c26b251ac070658317d743fa27ee2f729859fb6bc121b1a848d8048ec632018a"

RPROVIDES:${PN} += "cmake-libmsym \
libmsym-devel"

RDEPENDS:${PN} += "libmsym0-2"

inherit rpm
