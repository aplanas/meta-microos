SUMMARY = "Documentation for texlive-fontsetup"
DESCRIPTION = "This package includes the documentation for texlive-fontsetup"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn65439"

RPM_NAME = "texlive-fontsetup-doc-2023.201.1.4svn65439-52.1.noarch.rpm"
RPM_HASH = "a9cedb68798303ee6ed795df15c7702118f2e8fe2fcb2536ad579823ea3669dbff23003fcbe48b13537d39ff34ff45b39f9af39e9400a0d8bbcbc189b7b2fa8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontsetup-doc"

RDEPENDS:${PN} += ""

inherit rpm
