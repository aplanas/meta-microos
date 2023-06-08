SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-ppc64le-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "3468dc3bb25187170c2873a22072ccf28689ce47371130a82014368d63bd681e2a58b8e2a274351c62e7f5fa719659f0393db7e753f3244f1db901194a3816f0"

RPROVIDES:${PN} += "cross-ppc64le-gcc11-icecream-backend cross-ppc64le-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
