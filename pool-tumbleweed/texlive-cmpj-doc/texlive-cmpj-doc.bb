SUMMARY = "Documentation for texlive-cmpj"
DESCRIPTION = "This package includes the documentation for texlive-cmpj"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.03svn58506"

RPM_NAME = "texlive-cmpj-doc-2023.209.3.03svn58506-54.1.noarch.rpm"
RPM_HASH = "402848f684461eb06c3cf1e98181da75bc22891bd250b1ea5a3d675b3c4576f604d9903409e938dcaaa092bcf4adaea39417107134b5ca1b4dabbd9afbe65c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmpj-doc"

RDEPENDS:${PN} += ""

inherit rpm
