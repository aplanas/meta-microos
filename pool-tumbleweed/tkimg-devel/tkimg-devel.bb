SUMMARY = "Header Files and C API Documentation for tkimg"
DESCRIPTION = "Files needed to compile/link C code against tkimg."
LICENSE = "BSD-3-Clause"

PV = "1.4.13"

RPM_NAME = "tkimg-devel-1.4.13-2.1.aarch64.rpm"
RPM_HASH = "6a87ba4c72ac0538af9919275531d35c8052be7878ff8cab1755c91c0f4af1c8aaf31c120381eceb5ee220764003ea151f44bfc3788bd293d1e0283d6889bf0e"

RPROVIDES:${PN} += "tkimg-devel"

RDEPENDS:${PN} += ""

inherit rpm
