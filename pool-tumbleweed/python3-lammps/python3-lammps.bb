SUMMARY = "LAMMPS python module"
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
This subpackage contains LAMMPS's Python module."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "python3-lammps-20201029-5.1.aarch64.rpm"
RPM_HASH = "15283292286b587314a363d54e0e2820b5e80fbcc86ed35754d84c6fcccf4cdb522feaeb9e9f57019f8a9e72dc6c0d062a19aa4cc2fdeb98d8545af65030c8f5"

RPROVIDES:${PN} += "python-lammps-/usr/lib64/python3.10/site-packages/lammps.py \
python3-lammps"

RDEPENDS:${PN} += "liblammps0 \
python-abi"

inherit rpm
