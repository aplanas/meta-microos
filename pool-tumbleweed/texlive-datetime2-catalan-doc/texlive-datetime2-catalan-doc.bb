SUMMARY = "Documentation for texlive-datetime2-catalan"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-catalan"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47032"

RPM_NAME = "texlive-datetime2-catalan-doc-2023.209.1.1svn47032-53.1.noarch.rpm"
RPM_HASH = "ef115e87c408e0227f778592eef11ac204e5b132b9c9ace8f6b64cec1b5b4f8e1c14d21517269dea98bd1afe6235e13f067924ca8d6626368e0774cc1ce53374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-catalan-doc"

RDEPENDS:${PN} += ""

inherit rpm
