SUMMARY = "Tests for the cjs package"
DESCRIPTION = "The cjs-tests package contains tests that can be used to verify \
the functionality of the installed cjs package."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "cjs-tests-5.0.0-1.11.aarch64.rpm"
RPM_HASH = "872e125e23380010ddc49fdeffea1896c35b116ce0b8d4e4c116163de062868cb635f947e4e93550e12767a0fb8e7ff18ddb61dad1f5e136d77799fc23690d5e"

RPROVIDES:${PN} += "cjs-tests \
libgimarshallingtests.so \
libregress.so \
libwarnlib.so \
typelib-GIMarshallingTests \
typelib-Regress \
typelib-WarnLib"

RDEPENDS:${PN} += "cjs"

inherit rpm
