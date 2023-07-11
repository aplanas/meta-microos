SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0+"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python39-usfm2osis-0.6.1+git.1613099315.8fda304-1.6.noarch.rpm"
RPM_HASH = "80a1049d26f09820dc20b95ec6c9428bb664ccdfdf27c496f0c9922ce6321c8d14c565c949a38f7479e3fb8f1f25aa7ce5694b736a498e1596db89e284d88567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-usfm2osis \
python39-usfm2osis \
python3dist-usfm2osis"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
