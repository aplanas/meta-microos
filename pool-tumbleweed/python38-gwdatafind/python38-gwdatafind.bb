SUMMARY = "Client library for the LIGO Data Replicator (LDR) service"
DESCRIPTION = "The client library for the LIGO Data Replicator (LDR) service. \
 \
The DataFind service allows users to query for the location of \
Gravitational-Wave Frame (GWF) files containing data from the current \
gravitational-wave detectors"
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python38-gwdatafind-1.1.3-1.1.noarch.rpm"
RPM_HASH = "1af6f913771fa74b3823bd4327d6e83086d6ea19cabc175f784dabc8ca022db35333ed0dc34f2cff0315a099efb170581ab2eeeb04c952e03fa0b06d43888558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-gwdatafind \
python38-gwdatafind \
python3dist-gwdatafind"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-igwn-auth-utils-requests \
python38-ligo-segments \
update-alternatives"

inherit rpm
