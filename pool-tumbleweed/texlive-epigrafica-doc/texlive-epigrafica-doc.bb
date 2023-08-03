SUMMARY = "Documentation for texlive-epigrafica"
DESCRIPTION = "This package includes the documentation for texlive-epigrafica"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.01svn17210"

RPM_NAME = "texlive-epigrafica-doc-2023.209.1.01svn17210-54.1.noarch.rpm"
RPM_HASH = "c47331bfdbba85dcf7231e6e255d231e8c4869b99896e6e28999add66ebd0e7c2af73bf512b8c615f767706e97df236f62d94e0152cefcd0d6af4cbe24274e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigrafica-doc"

RDEPENDS:${PN} += ""

inherit rpm
