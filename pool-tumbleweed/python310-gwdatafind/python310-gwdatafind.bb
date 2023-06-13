SUMMARY = "Client library for the LIGO Data Replicator (LDR) service"
DESCRIPTION = "The client library for the LIGO Data Replicator (LDR) service. \
 \
The DataFind service allows users to query for the location of \
Gravitational-Wave Frame (GWF) files containing data from the current \
gravitational-wave detectors"
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python310-gwdatafind-1.1.3-1.1.noarch.rpm"
RPM_HASH = "8fdb9890add7e9c9382a14bdfcc6e4d28e6aa69d338f7f83bf3dda421b444e11fc156958abcaecedd6abd4ce3d44a3bd1b950f604015b29c955ae95216b0e48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwdatafind \
python3.10dist(gwdatafind) \
python310-gwdatafind \
python3dist(gwdatafind)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-igwn-auth-utils-requests \
python310-ligo-segments \
update-alternatives"

inherit rpm
