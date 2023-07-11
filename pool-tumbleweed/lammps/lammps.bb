SUMMARY = "Molecular Dynamics Simulator"
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
designed to be easy to modify or extend with new functionality."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "lammps-20201029-5.2.aarch64.rpm"
RPM_HASH = "ddd3f8d8f15984b12ac1b424f5a29b6053ad1f426b3d92b78c260165591997389f4f18bf4ca46f0a840b8ea66e06fe9a4cde6e83728a09ce6df546a4056533ce"

RPROVIDES:${PN} += "lammps"

RDEPENDS:${PN} += "lammps-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblammps.so.0 \
libm.so.6 \
libmpi.so.40 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
