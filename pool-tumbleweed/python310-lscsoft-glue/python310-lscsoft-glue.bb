SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python310-lscsoft-glue-3.0.1-1.7.aarch64.rpm"
RPM_HASH = "ad2108c4fd2cd2fa39125cf1ece647dd373029843aa9543cf560056e9af9caf4f33e3986e9cba8d2466ef0d52fcaca0ea6d284b9fdcbd2a0d99d1d88aecf6b27"

RPROVIDES:${PN} += "python-glue \
python3.10dist-lscsoft-glue \
python310-glue \
python310-lscsoft-glue \
python3dist-lscsoft-glue"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
lscsoft-glue-data \
python-abi \
python310-ligo-segments \
python310-numpy \
python310-pyRXP \
update-alternatives"

inherit rpm
