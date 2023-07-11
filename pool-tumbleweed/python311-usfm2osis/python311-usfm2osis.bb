SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0+"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python311-usfm2osis-0.6.1+git.1613099315.8fda304-1.6.noarch.rpm"
RPM_HASH = "ce80f12c154b5efa0e4bf07c406cfe489187c0fc925988fc99aff34a1ee883f490413d96ca4bd8f8abd4852eef20ea37b5a22f20158374e86195d17df4bc8a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-usfm2osis \
python3.11dist-usfm2osis \
python311-usfm2osis \
python3dist-usfm2osis"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
