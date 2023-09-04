SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python39-lscsoft-glue-3.0.1-1.7.aarch64.rpm"
RPM_HASH = "fbfccdac7611e029ac9fa85d928dc1d82ed18131dbce1611619deb3f9cf1e203206b0ab0d1971d8889d172db9f399a1a1f0934da3f77d8ec9f1c668298f2e68a"

RPROVIDES:${PN} += "python-glue \
python3.9dist-lscsoft-glue \
python39-glue \
python39-lscsoft-glue \
python3dist-lscsoft-glue"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
lscsoft-glue-data \
python-abi \
python39-ligo-segments \
python39-numpy \
python39-pyRXP \
update-alternatives"

inherit rpm
