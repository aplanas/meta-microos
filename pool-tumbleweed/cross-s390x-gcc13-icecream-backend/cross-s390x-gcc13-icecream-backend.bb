SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-s390x-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "7b7c4ba2e8e57d9833cf3d5ac0e71ba5cbe7e05f2eae3ac053d1a0ffd06f117fdd63ec131f4ee6d2b8061b114c4063ebe898a253f354597421d302d460c7899c"

RPROVIDES:${PN} += "cross-s390x-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
