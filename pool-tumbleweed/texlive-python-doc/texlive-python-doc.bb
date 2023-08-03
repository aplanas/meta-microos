SUMMARY = "Documentation for texlive-python"
DESCRIPTION = "This package includes the documentation for texlive-python"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.22svn60162"

RPM_NAME = "texlive-python-doc-2023.209.0.0.22svn60162-54.1.noarch.rpm"
RPM_HASH = "c00822fb1f7e06fc9ff474a5a5d26adbf4ccfa5de4fa2806062e95a0d6817992609218c21a18164f6d19bcaef60d409c5a7b21e4af220465e1396ed32a5b4d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
