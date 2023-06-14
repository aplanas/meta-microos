SUMMARY = "Development headers and libraries for LAMMPS"
DESCRIPTION = "LAMMPS is a classical molecular dynamics code, and an acronym for Large-scale \
Atomic/Molecular Massively Parallel Simulator. \
 \
LAMMPS has potentials for soft materials (biomolecules, polymers) and \
solid-state materials (metals, semiconductors) and coarse-grained or \
mesoscopic systems. It can be used to model atoms or, more generically, as a \
parallel particle simulator at the atomic, meso, or continuum scale. \
 \
LAMMPS runs on single processors or in parallel using message-passing \
techniques and a spatial-decomposition of the simulation domain. The code is \
designed to be easy to modify or extend with new functionality. \
 \
This package contains development headers and libraries for LAMMPS."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "lammps-devel-20201029-5.1.aarch64.rpm"
RPM_HASH = "f9943baccb1cdb1e04e128c9698031ea4fb49e043633d4d247121dcb3a220ebbf370f37e88ac260530af61f422b60b9be0f40228d229e9a48a39fcc9de46d84b"

RPROVIDES:${PN} += "cmake-LAMMPS \
lammps-devel \
pkgconfig-liblammps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lammps \
liblammps0"

inherit rpm
