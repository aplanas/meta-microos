SUMMARY = "Documentation for texlive-tracklang"
DESCRIPTION = "This package includes the documentation for texlive-tracklang"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.1svn65263"

RPM_NAME = "texlive-tracklang-doc-2023.201.1.6.1svn65263-52.1.noarch.rpm"
RPM_HASH = "c0a81d50489f84f9751788dd60b592d96712537e36f19402fb8699155f537c2ab0d371d2a17958b8ea4521de1f5a3a943249a25fbc8d69c3ca8b30b9ec2d6e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tracklang-doc"
RDEPENDS:${PN} += ""

inherit rpm
