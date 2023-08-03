SUMMARY = "Documentation for texlive-hfutexam"
DESCRIPTION = "This package includes the documentation for texlive-hfutexam"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn66550"

RPM_NAME = "texlive-hfutexam-doc-2023.209.1.7svn66550-54.1.noarch.rpm"
RPM_HASH = "5e793b5079f4a2adb11ec3ba16c9bf95747c4fe703acdafca1397050009c505ce7b8eaac4630e5a957f36ebeae67ed01e5177eb6e9065dc5b6810df9928c4e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfutexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
