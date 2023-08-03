SUMMARY = "Documentation for texlive-gitlog"
DESCRIPTION = "This package includes the documentation for texlive-gitlog"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-doc-2023.209.0.0.0.betasvn38932-54.1.noarch.rpm"
RPM_HASH = "7ef133e549dae194cbbcdd7274785bb67608ddfb5ab242b3de65d800dd8b6231f8f6d7455e6a342e0fd6219eb1c16ac13994daf68916b4160526149a298a3ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitlog-doc"

RDEPENDS:${PN} += ""

inherit rpm
