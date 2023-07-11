SUMMARY = "Documentation for texlive-pst-tvz"
DESCRIPTION = "This package includes the documentation for texlive-pst-tvz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-doc-2023.201.1.01svn23451-53.2.noarch.rpm"
RPM_HASH = "993d508ffee28bcb160dbb95e77a97c4abf63ba2b5f33d2916e89bdad5c6351fbb1a162674af23fe11ea336a995948e52667f8641b25ad0bc749abf657cd7996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tvz-doc"

RDEPENDS:${PN} += ""

inherit rpm
