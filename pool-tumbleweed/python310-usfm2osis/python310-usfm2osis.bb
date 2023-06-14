SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0+"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python310-usfm2osis-0.6.1+git.1613099315.8fda304-1.4.noarch.rpm"
RPM_HASH = "5e643850d701a114d993114ba4c5e70e7b9253b3f543899ca60be199ad0b59137dfeb2619081f3ae8a7a76d61af3c3b23d746c100e4805164a53af3825dc7a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-usfm2osis \
python3.10dist-usfm2osis \
python310-usfm2osis \
python3dist-usfm2osis"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
