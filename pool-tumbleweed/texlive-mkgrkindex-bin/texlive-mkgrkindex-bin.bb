SUMMARY = "Binary files of mkgrkindex"
DESCRIPTION = "Binary files of mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14428"

RPM_NAME = "texlive-mkgrkindex-bin-2023.20230311.svn14428-92.1.aarch64.rpm"
RPM_HASH = "34f735b3cebac9c50faace2a6462d8ce6610290f4219065a2424f54301a9d12b383b06c566b83afc297304eaba687e64cffb880d83712452e695ef915e164493"

RPROVIDES:${PN} += "texlive-mkgrkindex-bin"

RDEPENDS:${PN} += "texlive-mkgrkindex"

inherit rpm
