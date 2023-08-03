SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-ppc64-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "4b44abe3d553935182e89f3e7b4a6f697065b1647a4c993220cc47a5324adc17a7e000cc20f7362cfc26aaa21a7737cd9f240f2a1fa508bc43343ee0a406c4f2"

RPROVIDES:${PN} += "cross-ppc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
