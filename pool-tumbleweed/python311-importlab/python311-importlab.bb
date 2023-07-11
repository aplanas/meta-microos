SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python311-importlab-0.8-1.6.noarch.rpm"
RPM_HASH = "88707fb9d10bf3bf4a4c1711ac47f21151d66697669bb475f65535a59d50712bffbeea847534d6ceef0c352b88659f0bd34d23bacdf98897055c070c382789b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlab \
python3.11dist-importlab \
python311-importlab \
python3dist-importlab"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-networkx \
update-alternatives"

inherit rpm
