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

RPM_NAME = "lammps-devel-20201029-5.2.aarch64.rpm"
RPM_HASH = "f1659484cdc3e1edfd910b0b6eb5bbfb9683c8415b082f57a6e4cdb9279ff339941ea487a6b103caa6aeb780da5f8a2b6c5c27f529d554caf1bf2b7079ce8af1"

RPROVIDES:${PN} += "cmake-LAMMPS \
lammps-devel \
pkgconfig-liblammps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lammps \
liblammps0"

inherit rpm
