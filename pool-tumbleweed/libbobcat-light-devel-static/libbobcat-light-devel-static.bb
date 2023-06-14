SUMMARY = "Bobcat static library"
DESCRIPTION = "Bobcat static library"
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat-light-devel-static-6.02.02-2.3.aarch64.rpm"
RPM_HASH = "0093c65494158606c35ce6bdc58692a0ae671a228afc663cfa3c37d76da566d131a8b93290fd0ece7208e8cf433474b6bab4f682d76a9887b8e1ad90ff20033d"

RPROVIDES:${PN} += "libbobcat-light-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
