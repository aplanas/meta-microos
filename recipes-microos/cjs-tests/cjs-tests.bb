SUMMARY = "Tests for the cjs package"
DESCRIPTION = "The cjs-tests package contains tests that can be used to verify \
the functionality of the installed cjs package."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "cjs-tests-5.0.0-1.10.aarch64.rpm"
RPM_HASH = "319c8ddcdb92db6039bcd3950d9d97bcbdfc259e350a0b1f9a78fcc6d4c6113fa438d2bfacbea7a36353d7a72042b194ddff2204e28ff3cfb923bdee9dc45ac0"

RPROVIDES:${PN} += "cjs-tests \
cjs-tests(aarch-64) \
libgimarshallingtests.so()(64bit) \
libregress.so()(64bit) \
libwarnlib.so()(64bit) \
typelib(GIMarshallingTests) \
typelib(Regress) \
typelib(WarnLib)"
RDEPENDS:${PN} += "cjs"

inherit rpm
