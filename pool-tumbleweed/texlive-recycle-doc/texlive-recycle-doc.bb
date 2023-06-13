SUMMARY = "Documentation for texlive-recycle"
DESCRIPTION = "This package includes the documentation for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-recycle-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "09019ebdff03d0d10d4a281e71272c71b4c6eaf7434a169611a2ff80b60cd550bccdf2ef58cb29e53ea51e2ef3c12896a50dbfa3bbee1b58b4d93c0fa7377c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
