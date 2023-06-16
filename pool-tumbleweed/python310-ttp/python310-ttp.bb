SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python310-ttp-0.9.4-1.1.noarch.rpm"
RPM_HASH = "4e27a45341078bd238eb829af44f4bd11eb48419a292bf21ebb561d82f1e6148c491de5a61ae45748fed1f17b23f30d930335a9563f697166c41a63c2956744a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ttp \
python3.10dist-ttp \
python310-ttp \
python3dist-ttp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
