SUMMARY = "Documentation for texlive-qpxqtx"
DESCRIPTION = "This package includes the documentation for texlive-qpxqtx"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45797"

RPM_NAME = "texlive-qpxqtx-doc-2023.201.svn45797-53.1.noarch.rpm"
RPM_HASH = "0d4f45b0a7ac41bc86b7ff20815062a3bf8db535987e8dbeb395e94ff7fc45c877bb3614bcb26b2dbc7de40c4bc5ba25fe0ff0799784f249cfaa5eb166578642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qpxqtx-doc"
RDEPENDS:${PN} += ""

inherit rpm
