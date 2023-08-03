SUMMARY = "Documentation for texlive-kalendarium"
DESCRIPTION = "This package includes the documentation for texlive-kalendarium"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48744"

RPM_NAME = "texlive-kalendarium-doc-2023.209.1.0svn48744-56.1.noarch.rpm"
RPM_HASH = "f05f3f960aca88ceea0c5d174913a24ebc1016e47c10fa15edf33b87829961773e74ac91cbf2af95a42539b514d167fc95fa5fa7b013bc2b0990d23e693a6f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kalendarium-doc"

RDEPENDS:${PN} += ""

inherit rpm
