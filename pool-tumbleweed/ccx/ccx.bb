SUMMARY = "An open source finite element package"
DESCRIPTION = "CalculiX is a package designed to solve field problems. \
The method used is the finite element method. So far only \
structural problems can be solved but it is planned to \
extend the capabilities."
LICENSE = "BSD-3-Clause & GPL-2.0-only & SUSE-Public-Domain"

PV = "2.20"

RPM_NAME = "ccx-2.20-1.4.aarch64.rpm"
RPM_HASH = "18240f14bec41c8d0c9b954c1797749dac96eab0385c408a8b815a66c6b6add83b09b60c1fc89bd1cfc77313a3187115f204aab182d01050dc4e83726d90f5da"

RPROVIDES:${PN} += "ccx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarpack.so.2 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libspooles.so.2.2"

inherit rpm
