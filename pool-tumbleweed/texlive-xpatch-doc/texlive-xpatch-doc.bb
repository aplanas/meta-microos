SUMMARY = "Documentation for texlive-xpatch"
DESCRIPTION = "This package includes the documentation for texlive-xpatch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-doc-2023.209.0.0.3svn54563-53.2.noarch.rpm"
RPM_HASH = "2958719ead0381be9c8e453a4c8f46e1c562633cd0491d808a2ba12f62da0ed1209aa35c62d647da5a7cc1bdb938a7053850eef67993c468a8664b29edef3d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
