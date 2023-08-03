SUMMARY = "Documentation for texlive-llncs"
DESCRIPTION = "This package includes the documentation for texlive-llncs"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.22svn64299"

RPM_NAME = "texlive-llncs-doc-2023.209.2.22svn64299-55.1.noarch.rpm"
RPM_HASH = "a7228e3aaf424febb6ecfb287a3b31368170c6666013c2458f9e3f6f645ad729ad99129762ae60038fcebafffaea5a8b62d9f677a526a5af6e984b34a76a4b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-llncs-doc"

RDEPENDS:${PN} += ""

inherit rpm
