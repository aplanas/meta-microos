SUMMARY = "Documentation for texlive-erewhon-math"
DESCRIPTION = "This package includes the documentation for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-doc-2023.209.0.0.56svn65684-54.1.noarch.rpm"
RPM_HASH = "96c028df36cb5e76579775b835b85c4a5078c7a84a53064f989cb9cea6e40accd6abc42c5b1e794c1d1ca0a66a20698cb89fa360aa9e792c9fd71082c7d7a3e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
