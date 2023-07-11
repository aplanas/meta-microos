SUMMARY = "Binary files of diadia"
DESCRIPTION = "Binary files of diadia"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37645"

RPM_NAME = "texlive-diadia-bin-2023.20230311.svn37645-92.1.noarch.rpm"
RPM_HASH = "48bd04b1969a43c5b4d1d9c812f44b9204fc081f609a7fd1e6b8f07b93d32545909a05e72cde112fb49e6f298cadead9d3e5ed90efac1c85c3da96236cccc78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-bin"

RDEPENDS:${PN} += "texlive-diadia"

inherit rpm
