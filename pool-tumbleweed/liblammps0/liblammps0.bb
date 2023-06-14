SUMMARY = "LAMMPS library"
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
This package contains the library of LAMMPS package."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "liblammps0-20201029-5.1.aarch64.rpm"
RPM_HASH = "d800b7ae9c3009c7e342a6ce4155fe4b7089b0957511c770f60ca61873c9c99aa8db1edb02d018cc5396a3cc0c724be43744355fd0b81dff7f658d926d32467a"

RPROVIDES:${PN} += "liblammps.so.0 \
liblammps0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
libkim-api.so.2 \
libm.so.6 \
libmpi.so.40 \
libpng16.so.16 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libvoro++.so.0"

inherit rpm
