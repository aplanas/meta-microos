SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparc64-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "a14ebfceb7060c1f56e684ff79fe34859e75adc6a33d1783a0781cafd4daa674675596faee6e1f0796ccfad82816545524a1b5f6567a8220bb87b551edd046a5"

RPROVIDES:${PN} += "cross-sparc64-gcc12-icecream-backend \
cross-sparc64-gcc12-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
