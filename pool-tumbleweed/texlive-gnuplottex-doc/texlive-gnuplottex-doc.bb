SUMMARY = "Documentation for texlive-gnuplottex"
DESCRIPTION = "This package includes the documentation for texlive-gnuplottex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-doc-2023.201.0.0.9.5svn54758-53.1.noarch.rpm"
RPM_HASH = "beba4aea319bd9b11394fadc655af4ece0e7d8d92b17cf8a99bd1ad166d04930fd80a74ca022480574cda13b77eb6e33e22d5e5f21111a4f4bb836bf1b8d220d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnuplottex-doc"
RDEPENDS:${PN} += ""

inherit rpm
