SUMMARY = "Documentation for texlive-antanilipsum"
DESCRIPTION = "This package includes the documentation for texlive-antanilipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.1svn55250"

RPM_NAME = "texlive-antanilipsum-doc-2023.209.0.0.8.1svn55250-55.1.noarch.rpm"
RPM_HASH = "963bd2bfbb9a0bf9f3cfa90ce9fdea367f6b453d429213a3a09165236589b26f081ea45208f36e0627e3bfb2bb24a08e90c016a95ee1ab14734d4b03b8b6e9a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antanilipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
