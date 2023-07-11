SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-hppa-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "c6c5debe1fd1bcce7c20156b77b650488f81da570d024712fafd2231be96c2e0a24ac3b3f94982c271e45a118e0deddd8e353e3e1087ea650b5f8213bbde701d"

RPROVIDES:${PN} += "cross-hppa-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
