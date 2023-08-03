SUMMARY = "Documentation for texlive-latex"
DESCRIPTION = "This package includes the documentation for texlive-latex"
LICENSE = "LPPL-1.0"

PV = "2023.209.20221101_pl1svn65161"

RPM_NAME = "texlive-latex-doc-2023.209.20221101_pl1svn65161-56.1.noarch.rpm"
RPM_HASH = "fc7045fb385e31b8bb7bd6791d53d7db82d641916ed7481e123a08f37efc306cfe690b67424c3497e0ef346a7b7cf8e9ae3fc2ce926e6a1a109a728fb5adc9a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
