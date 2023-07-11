SUMMARY = "Headers and documentation for the Bobcat library"
DESCRIPTION = "Headers and documentation of classes defined in the Bobcat library."
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat-devel-6.02.02-2.4.aarch64.rpm"
RPM_HASH = "1ccfe6032a7cfbbcd515dba5e3977eeddce6dcb4a95a13d81ed110fced325d0c2dcbb0e31acd7c8c84693d1b2e8dcc1ddba35830a12a935a3b113f8dd922aca9"

RPROVIDES:${PN} += "libbobcat-devel"

RDEPENDS:${PN} += "libbobcat6"

inherit rpm
