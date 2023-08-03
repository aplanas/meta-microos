SUMMARY = "Documentation for texlive-texvc"
DESCRIPTION = "This package includes the documentation for texlive-texvc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46844"

RPM_NAME = "texlive-texvc-doc-2023.209.1.1svn46844-55.1.noarch.rpm"
RPM_HASH = "bf2448b95f8e793a1f069034f278e7f198ecf177238cfd4fb73f491804c802e163f016b1cd4de31fa80ed4e0e185edf162a28b315f190cc599912993cc72c8f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texvc-doc"

RDEPENDS:${PN} += ""

inherit rpm
