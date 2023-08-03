SUMMARY = "Documentation for texlive-spalign"
DESCRIPTION = "This package includes the documentation for texlive-spalign"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42225"

RPM_NAME = "texlive-spalign-doc-2023.209.svn42225-58.1.noarch.rpm"
RPM_HASH = "f81a146d19afabf3b90df465b56c79d0616603fdafe1a3804d010ced8548b3a59f9f77aeafe67a76ec3ec70c6b48a83baf3edf31eba2b86fd0eef44273d1f18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
