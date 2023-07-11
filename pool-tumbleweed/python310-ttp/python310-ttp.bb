SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python310-ttp-0.9.4-1.3.noarch.rpm"
RPM_HASH = "e87d5efbafa63044dbcd0a73d07d175d48ae70df881e3998246a3ce19b9141ba443eaac847ad1a0a4814248dc5458d3487bb534ede0ec29b5d05efb2952e3ce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ttp \
python310-ttp \
python3dist-ttp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
