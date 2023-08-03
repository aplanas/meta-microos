SUMMARY = "Documentation for texlive-ktv-texdata"
DESCRIPTION = "This package includes the documentation for texlive-ktv-texdata"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.05.34svn27369"

RPM_NAME = "texlive-ktv-texdata-doc-2023.209.05.34svn27369-56.1.noarch.rpm"
RPM_HASH = "8cf2cdc2776a2f2b4fb9f74ed166b9c15ea2063756af4417fe5222335559a4de9738c951b11a5ddc107b3d5e9f35fe2266183ec44270da426087610cab260173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ktv-texdata-doc"

RDEPENDS:${PN} += ""

inherit rpm
