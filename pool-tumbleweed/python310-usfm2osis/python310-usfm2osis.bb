SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0+"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python310-usfm2osis-0.6.1+git.1613099315.8fda304-1.6.noarch.rpm"
RPM_HASH = "24cb691258c349b89ce45b8f6c0d9f62fc56869d34ef66c266dd4869bbcebba51a35e862900ea92b07313c73dd7485a73ef8e33e6bf5827f73154e325e7ed47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-usfm2osis \
python310-usfm2osis \
python3dist-usfm2osis"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
