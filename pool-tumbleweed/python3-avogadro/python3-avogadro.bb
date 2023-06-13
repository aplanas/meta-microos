SUMMARY = "Python bindings for Avogadro libraries"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "python3-avogadro-1.97.0-2.3.aarch64.rpm"
RPM_HASH = "eac88f61057b2e955833fc98b3d375b7bfde6ca8d036c6a761d73bc6f3fc1a9ba3844f86e604c37b590eb852f6c6d6971acc6408d4cf8a542848e3046cf081e4"

RPROVIDES:${PN} += "python3-avogadro \
python3-avogadro(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libAvogadroCore.so.1()(64bit) \
libAvogadroIO.so.1()(64bit) \
libAvogadroQuantumIO.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
