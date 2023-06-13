SUMMARY = "Documentation for texlive-antanilipsum"
DESCRIPTION = "This package includes the documentation for texlive-antanilipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.1svn55250"

RPM_NAME = "texlive-antanilipsum-doc-2023.201.0.0.8.1svn55250-54.1.noarch.rpm"
RPM_HASH = "8187452ca44e762aa3cb9d2839a1da1f0981b93c8f1852213763fc8327bf3d907a9df9806d991e38f280952d7ed3dc37cbacac236e968c899b4a5bf3be43277a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antanilipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
