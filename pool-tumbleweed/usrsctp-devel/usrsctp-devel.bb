SUMMARY = "Usersctp Development Kit"
DESCRIPTION = "The development files for usersctp."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "usrsctp-devel-0.9.5.0-1.10.aarch64.rpm"
RPM_HASH = "1df1f4122422060913a4c49e04c8a9b15d5eeee803d56a8dcfee5b3e843fb985efde45785f70b8278e83fd55ea2e103fdcdbd2a535146eaceb093c4e6ea9f409"

RPROVIDES:${PN} += "usrsctp-devel"

RDEPENDS:${PN} += "libusrsctp2"

inherit rpm
