SUMMARY = "Documentation for texlive-gitinfo2"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo2"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.7svn38913"

RPM_NAME = "texlive-gitinfo2-doc-2023.209.2.0.7svn38913-54.1.noarch.rpm"
RPM_HASH = "abda97234a189ea3a856072fc2bfe58f475c1f70e6a8b61ba75c90aa9a1c09b06134c7da93eb8c6bb6da97570d44d28e52c440d50d3ba3304d4e1bc3bf53ee25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo2-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
