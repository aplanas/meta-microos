SUMMARY = "API documentation for SoQt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "SoQt-doc-1.6.0-2.8.noarch.rpm"
RPM_HASH = "642af6cb64e85e8a2aeeddd9903a3c7b382770c77ac65b0a41392240dd5a2b34da37e00250591f04cac10599e998217db91f441569644ae377e36f157c75c2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SoQt-doc"

RDEPENDS:${PN} += ""

inherit rpm
