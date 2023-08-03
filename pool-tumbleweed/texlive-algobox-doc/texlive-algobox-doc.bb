SUMMARY = "Documentation for texlive-algobox"
DESCRIPTION = "This package includes the documentation for texlive-algobox"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn52204"

RPM_NAME = "texlive-algobox-doc-2023.209.1.3svn52204-55.1.noarch.rpm"
RPM_HASH = "f9e462d1a10d868e599ae1d7e4e2d6f7262f89df81fb45bb0c31752064b0f8d42a3879d2d0f8775e078ac584c2fd0e67a08a32d3633fe93bfa3e4aca274da0cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algobox-doc"

RDEPENDS:${PN} += ""

inherit rpm
