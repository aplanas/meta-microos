SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python310-lscsoft-glue-3.0.1-1.6.aarch64.rpm"
RPM_HASH = "be31f3fb35417acfb3d49c32a4d0666fee80980d70e9d4f177a3d73cc17b24ebbf9ad7fea0b11b83cf5b2c88df240242fb90e6832b6b90e77804c2b859a314cb"

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
