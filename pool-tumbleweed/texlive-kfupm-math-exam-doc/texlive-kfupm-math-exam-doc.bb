SUMMARY = "Documentation for texlive-kfupm-math-exam"
DESCRIPTION = "This package includes the documentation for texlive-kfupm-math-exam"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn63977"

RPM_NAME = "texlive-kfupm-math-exam-doc-2023.201.0.0.1.0svn63977-55.1.noarch.rpm"
RPM_HASH = "c9dcce023fb956ccac8fe0b05afa9e6023a6c46eec904cc28bb60b19ed67e4b37855208f3e361e0a3dcd371ccc090f07a342dfde74c0dab43209deaa4a976087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kfupm-math-exam-doc"

RDEPENDS:${PN} += ""

inherit rpm
