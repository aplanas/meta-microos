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

RPM_NAME = "python3-lammps-20201029-5.2.aarch64.rpm"
RPM_HASH = "e0a18a4285715bd00d7c15e727e340cb75f63d4c0dd84cf0220fa02d6dda5dd23d25a5dd790a72d123510b361c76281b9429c9cfda525ee5aca5618279dd7d33"

RPROVIDES:${PN} += "python-lammps-/usr/lib64/python3.11/site-packages/lammps.py \
python3-lammps"

RDEPENDS:${PN} += "liblammps0 \
python-abi"

inherit rpm
