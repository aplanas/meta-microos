SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparcv9-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "9676e7e52ce280a9806a168b08039ea9dcad33b28b23fec045cfda384a02bc5e3df3fdb1f8762664af5e61ac12bf43dffb152ad71b17eec17e94230a8a6ab57f"

RPROVIDES:${PN} += "cross-sparcv9-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
