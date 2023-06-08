SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-sparc64-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "3bd365e61798d048ed63643632aec04e7b1c5b0f594491a242671bbcf0b2beacff13ce12aa519ba4bf7c63eff1a1c65683e9116b6bac57467330f656a5b45f00"

RPROVIDES:${PN} += "cross-sparc64-gcc13-icecream-backend cross-sparc64-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
