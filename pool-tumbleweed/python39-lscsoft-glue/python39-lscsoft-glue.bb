SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python39-lscsoft-glue-3.0.1-1.4.aarch64.rpm"
RPM_HASH = "07191c4973c07aca72f7e49a5a18219783617da2a1bba066d96f8123aa87cd381082f08699dcd85163883005ddeedc1c9fd2fde40aac920b330cec6f74f9ea4e"

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
