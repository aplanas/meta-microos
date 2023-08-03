SUMMARY = "Documentation for texlive-featpost"
DESCRIPTION = "This package includes the documentation for texlive-featpost"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.8.8svn35346"

RPM_NAME = "texlive-featpost-doc-2023.209.0.0.8.8svn35346-53.1.noarch.rpm"
RPM_HASH = "ddb445541cfa065a4d6f8d1ddeb0d2d622aa69dfcf6c5af7e7782a10685caadcd24f23a6623d7ef5e1c964bc58831e23b4440f0fd528dc508646abcf865071e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-featpost-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
