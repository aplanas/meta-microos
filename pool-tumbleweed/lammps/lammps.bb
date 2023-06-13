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

RPM_NAME = "lammps-20201029-5.1.aarch64.rpm"
RPM_HASH = "87102f9745196ec4d21367d2ac05d9601b0e9bec7d6229a59e28ba82ec55870141345b6ad7a4b05d714834b4e7b14f441e1bdc568f5b46102e0792a3ba4573ef"

RPROVIDES:${PN} += "lammps \
lammps(aarch-64)"

RDEPENDS:${PN} += "lammps-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblammps.so.0()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
