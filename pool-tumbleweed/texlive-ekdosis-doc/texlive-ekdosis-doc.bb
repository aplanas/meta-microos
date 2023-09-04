SUMMARY = "Documentation for texlive-ekdosis"
DESCRIPTION = "This package includes the documentation for texlive-ekdosis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn61113"

RPM_NAME = "texlive-ekdosis-doc-2023.209.1.4svn61113-54.2.noarch.rpm"
RPM_HASH = "5b48debc7800379827dfd7ec8766c070e68ae4e0f1231cb911b1100cc8c16b5fea970e9d23201458618c0cdc780bb1f6cc85f58e6b110addd09aea40cd4b9317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekdosis-doc"

RDEPENDS:${PN} += ""

inherit rpm
