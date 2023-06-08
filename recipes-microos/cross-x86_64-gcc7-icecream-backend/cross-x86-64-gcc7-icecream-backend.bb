SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "daa21ea0c39c5d0da7816fce69d40284d22c7ed266480f91c36238fc70af5cdda3b6aacab421f3e6b90f195ee098bd4045431cb9917f74ae602fe4a094390868"

RPROVIDES:${PN} += "cross-x86_64-gcc7-icecream-backend cross-x86_64-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
