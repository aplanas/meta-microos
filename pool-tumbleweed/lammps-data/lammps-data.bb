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

RPM_NAME = "lammps-data-20201029-5.2.noarch.rpm"
RPM_HASH = "4182306ab37a269df55225b583545f33b6e4934c503dac5c283091ceacf30fb19bb0e0404358ccd079f4ddacc3ea7956333c43c32d030c3b3127357b9cdc9365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lammps-data \
lammps-data"

RDEPENDS:${PN} += ""

inherit rpm
