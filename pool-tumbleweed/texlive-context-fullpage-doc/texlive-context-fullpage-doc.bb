SUMMARY = "Documentation for texlive-context-fullpage"
DESCRIPTION = "This package includes the documentation for texlive-context-fullpage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-fullpage-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "2dfb93634bb4a5a0e2411cc7afc3bcc31a876799507f31ae1494291303658cab6b2db19576b84763998a955365e3292d1219f7fb480eacb976981998b4f8b46d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fullpage-doc"
RDEPENDS:${PN} += ""

inherit rpm
