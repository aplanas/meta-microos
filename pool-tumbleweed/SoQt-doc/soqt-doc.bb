SUMMARY = "API documentation for SoQt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "SoQt-doc-1.6.0-2.9.noarch.rpm"
RPM_HASH = "aa3a1af53b825d19788a4b491b25e947963b07275d63fc283bbbe1d829eb7d286e6c60a44c6905d64bcfc19a58101932678920292245feff96e3d4c16ee54048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SoQt-doc"

RDEPENDS:${PN} += ""

inherit rpm
