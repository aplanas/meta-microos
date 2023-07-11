SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-seqdiag-3.0.0-1.8.noarch.rpm"
RPM_HASH = "1f8e9233acbbf5de162ec1145459a9c7c5b5134843f0054ec6a18674bf86c2742a8d5311ec9afda9a6a491fd5f1fb15a70eb74f521710c1263727d54459eca20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-seqdiag \
python310-seqdiag \
python3dist-seqdiag"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-blockdiag \
python310-setuptools \
update-alternatives"

inherit rpm
