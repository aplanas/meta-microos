SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "882e3d7ea0268dc0db49cf7a5fcc35e0558102b3885e5efa7da962fc10910261a377c63ff6a335f7521d2af582ddae8fe8c4114ab2731ffc26c11f1903abfe31"

RPROVIDES:${PN} += "cross-ppc64le-gcc7-icecream-backend cross-ppc64le-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
