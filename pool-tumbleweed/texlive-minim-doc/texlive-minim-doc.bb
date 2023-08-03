SUMMARY = "Documentation for texlive-minim"
DESCRIPTION = "This package includes the documentation for texlive-minim"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-doc-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "73392a529a2fa1ab6f9d12122939a0bb7fc45a2ef572dae571a18e27fe334a28cfd29cd94ab40941563652ee73fa37b73d14c0aa9df5410b31be55350b09bd45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-doc"

RDEPENDS:${PN} += ""

inherit rpm
