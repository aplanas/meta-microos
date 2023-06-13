SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "57f6af887b8a741f152ebcf6bd52251ff200b8925965b2fd67f17d9619f7b5e6db482a58234557ffc60cafa31ab3845e299877434bedf99d5050c4558a8ac2e2"

RPROVIDES:${PN} += "cross-sparc64-gcc7-icecream-backend \
cross-sparc64-gcc7-icecream-backend(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
