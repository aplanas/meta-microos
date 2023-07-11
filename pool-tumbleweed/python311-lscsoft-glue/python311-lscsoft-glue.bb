SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python311-lscsoft-glue-3.0.1-1.6.aarch64.rpm"
RPM_HASH = "28796102e22688654257266db3ec1775951a2da7713667630607a004e0e7f67eb40119199fe8525ee4f42980c3045f8ba289a028d33bd4c3fe9243672d443ea8"

RPROVIDES:${PN} += "python-glue \
python3-glue \
python3-lscsoft-glue \
python3.11dist-lscsoft-glue \
python311-glue \
python311-lscsoft-glue \
python3dist-lscsoft-glue"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
lscsoft-glue-data \
python-abi \
python311-ligo-segments \
python311-numpy \
python311-pyRXP \
update-alternatives"

inherit rpm
