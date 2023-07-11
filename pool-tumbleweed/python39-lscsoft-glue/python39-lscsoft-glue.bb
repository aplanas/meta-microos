SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python39-lscsoft-glue-3.0.1-1.6.aarch64.rpm"
RPM_HASH = "2361aa7c26fe6a32d439e7aca6631545b80c4df6a60dc0cf1882884b5fecd2a92c0a87e6052275b1adadf39ccf12d848b97a941635cb756b47329b4e4fb626ba"

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
