SUMMARY = "Documentation for texlive-tex-label"
DESCRIPTION = "This package includes the documentation for texlive-tex-label"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16372"

RPM_NAME = "texlive-tex-label-doc-2023.209.svn16372-55.1.noarch.rpm"
RPM_HASH = "5f77e4b575e5464cc5b4416ec2c4a575ca317b45ac7cecfafd51ad0334a718c61db64012cf3c404a608e813fe0d3031c592f9a1e3c3225c6077efcd86465f30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-label-doc"

RDEPENDS:${PN} += ""

inherit rpm
