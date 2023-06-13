SUMMARY = "Documentation for texlive-fourier"
DESCRIPTION = "This package includes the documentation for texlive-fourier"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn61937"

RPM_NAME = "texlive-fourier-doc-2023.201.2.3svn61937-52.1.noarch.rpm"
RPM_HASH = "421cad652a9f58e7b724176d1a418f7ea9a222e54508b37e88de0f3b1b6fabb75e2b3b56408116bfa6f0aa6ef57a42f5ec75c3b4621a3dfdea60c5317aa03650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fourier-doc"

RDEPENDS:${PN} += ""

inherit rpm
