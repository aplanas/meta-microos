SUMMARY = "Documentation for texlive-arphic-ttf"
DESCRIPTION = "This package includes the documentation for texlive-arphic-ttf"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42675"

RPM_NAME = "texlive-arphic-ttf-doc-2023.209.svn42675-54.1.noarch.rpm"
RPM_HASH = "a4c5828070080fbc5b7f91477141e20da50832895df6654709d0a2bde82eae4f7158fc8fa786f65f0af0aa45ff8f805dc3ee4d10a908ba70bb2813b39286ab35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-ttf-doc"

RDEPENDS:${PN} += ""

inherit rpm
