SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-mips-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "f016638c504cece17568a797976ab8fa45f02c497e3358021f2f65afd76091ef7ccfe9ae2b1dbaa81bd278ec496f2539836ce2546af97eeecdc409d59842f55e"

RPROVIDES:${PN} += "cross-mips-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
