SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-sparcv9-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "53cb0dfda57c66931182a94fb930bb052839d46649ff234825bb796a26984badc519075356b8675e52d654c3b1e1e3aea852b8a0ffd51c6a98517f088919119e"

RPROVIDES:${PN} += "cross-sparcv9-gcc11-icecream-backend cross-sparcv9-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
