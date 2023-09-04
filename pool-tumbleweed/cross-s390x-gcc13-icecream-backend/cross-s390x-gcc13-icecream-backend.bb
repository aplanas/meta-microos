SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-s390x-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "3869b955a46a63b5f5cc84ee6f525a645e76a40263643b5ac471f13e8d1fe8a096eaabd84b3b4d25fe9c17d7400b063f1b5631f3a95039f132c2c4989c74d427"

RPROVIDES:${PN} += "cross-s390x-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
