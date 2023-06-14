SUMMARY = "LAMMPS data"
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
This subpackage contains LAMMPS's potential files"
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "lammps-data-20201029-5.1.noarch.rpm"
RPM_HASH = "127f6ff89f882684381890a86009edaa2bf2649398c6f45513b6fc031bbcf52e4f9ad8f7cf35c0b1e4bb7dce5a1e9c3fb6950189936c9af2ced20e483fbf7beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lammps-data \
lammps-data"

RDEPENDS:${PN} += ""

inherit rpm
