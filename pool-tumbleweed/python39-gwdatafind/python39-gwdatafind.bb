SUMMARY = "Client library for the LIGO Data Replicator (LDR) service"
DESCRIPTION = "The client library for the LIGO Data Replicator (LDR) service. \
 \
The DataFind service allows users to query for the location of \
Gravitational-Wave Frame (GWF) files containing data from the current \
gravitational-wave detectors"
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python39-gwdatafind-1.1.3-1.1.noarch.rpm"
RPM_HASH = "766d63c52205a05dad6fb5e0497bc3f74f68a94853c1a851ec481df4f7eab183e7a15bc6f58128f3f2e2f9ca71ea78130c9338e4a6a5a7c9d535d639bf9fd7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gwdatafind) \
python39-gwdatafind \
python3dist(gwdatafind)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-igwn-auth-utils-requests \
python39-ligo-segments \
update-alternatives"

inherit rpm
