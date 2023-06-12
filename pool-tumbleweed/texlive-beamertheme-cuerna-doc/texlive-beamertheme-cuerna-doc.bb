SUMMARY = "Documentation for texlive-beamertheme-cuerna"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-cuerna"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42161"

RPM_NAME = "texlive-beamertheme-cuerna-doc-2023.201.svn42161-53.1.noarch.rpm"
RPM_HASH = "7361455e0aeabd02d53760bffd7ae28e4dabb7b6244ba9b75ffebdd5c5318c3195f5f5ee867dedd25dc76d32e44d4420932c50ff4afa3dbac9673e0108447980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-cuerna-doc"
RDEPENDS:${PN} += ""

inherit rpm
