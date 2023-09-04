SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python311-lscsoft-glue-3.0.1-1.7.aarch64.rpm"
RPM_HASH = "522a75ddfca42c9d30bb34c2c98d7fd1dc9658fed44c92b67fafd3dc50e35fb923a37a44849789cb15316dd11a8030f3668ec62f3ff5d0081a3ee0f359faa627"

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
