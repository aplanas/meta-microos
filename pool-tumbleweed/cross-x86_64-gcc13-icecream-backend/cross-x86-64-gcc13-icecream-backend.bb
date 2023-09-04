SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-x86_64-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "c8dc85eadf7a00043c09b31e1935c07e3406420cb8a9a29cbdd961c3389b4af355d38313ae552623ff326087ebdf17383a724e9db4211e236241bbac6739d03b"

RPROVIDES:${PN} += "cross-x86-64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
