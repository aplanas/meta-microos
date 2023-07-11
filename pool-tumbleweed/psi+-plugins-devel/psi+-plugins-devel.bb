SUMMARY = "Headers for Psi plugins"
DESCRIPTION = "Headers and qmake project include files for developing Psi+ plugins."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-devel-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "65694788309513cd99e7985faf8e494606d316a0b1348b93b2b7be7cc5fb12dac3167a2ad309a261e53fb546309cdf33758168d6b956e4bc5c783150764448af"

RPROVIDES:${PN} += "psi+-plugins-devel"

RDEPENDS:${PN} += "psi+"

inherit rpm
