SUMMARY = "Documentation for texlive-bxpapersize"
DESCRIPTION = "This package includes the documentation for texlive-bxpapersize"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn63174"

RPM_NAME = "texlive-bxpapersize-doc-2023.201.0.0.6svn63174-52.1.noarch.rpm"
RPM_HASH = "bc52612cdcd827cab87e70be788f11a406f2fdee44dde93aeb4d458c963cecf2100a5bf56209a0f1efdf4d9a533dfb6cf4f233bf833bfe63cd23a02f3cf9c443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxpapersize-doc"

RDEPENDS:${PN} += ""

inherit rpm
