SUMMARY = "Header files for Avogadro libraries"
DESCRIPTION = "Header files for Avogadro libraries."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "avogadrolibs-devel-1.97.0-2.3.aarch64.rpm"
RPM_HASH = "e4d4770d20be59e56931e44387c6b943330c5b7bc27bebb52b4a21bfc92e92bb6a9ab56d94624ed2be894a91e59c040669ebe134f71bc5c9dd8b607577dec377"

RPROVIDES:${PN} += "avogadrolibs-devel avogadrolibs-devel(aarch-64) cmake(AvogadroLibs)"
RDEPENDS:${PN} += "avogadrolibs-plugins cmake(MoleQueue) cmake(Qt5Network) cmake(Qt5Widgets) libAvogadro1 pkgconfig(gl) pkgconfig(glew)"

inherit rpm
