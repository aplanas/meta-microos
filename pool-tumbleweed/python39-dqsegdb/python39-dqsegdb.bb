SUMMARY = "Client library for DQSegDB"
DESCRIPTION = "python-dqsegdb provides the python bindings and the client tools to \
connect to LIGO/VIRGO DQSEGDB server instances."
LICENSE = "GPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "python39-dqsegdb-2.0.0-2.4.noarch.rpm"
RPM_HASH = "48bbc51cb4f702f0cf511c3299fb575ba58d3325c80c653467242a3a4202951c3a1ff1f4cb4defab5ae01139be563e59ebd09dbfbcafa6e38ed4f8bb9daa88a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dqsegdb \
python39-dqsegdb \
python3dist-dqsegdb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-gwdatafind \
python39-lal \
python39-lscsoft-glue \
python39-numpy \
python39-pyOpenSSL \
python39-pyRXP \
update-alternatives"

inherit rpm
