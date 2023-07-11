SUMMARY = "Python bindings for Avogadro libraries"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "python3-avogadro-1.97.0-2.4.aarch64.rpm"
RPM_HASH = "4ea2dccfc321627197e6d35c3be896c4348fde2d9103f584f54aeea9d859822a501035020a13b46fa298378f79baed959c438bf4910984479ef888324b587467"

RPROVIDES:${PN} += "python3-avogadro"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroQuantumIO.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
