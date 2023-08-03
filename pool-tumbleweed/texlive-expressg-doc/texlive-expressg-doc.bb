SUMMARY = "Documentation for texlive-expressg"
DESCRIPTION = "This package includes the documentation for texlive-expressg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn29349"

RPM_NAME = "texlive-expressg-doc-2023.209.1.5svn29349-53.1.noarch.rpm"
RPM_HASH = "1f126770157b5ae1d1fbacca8d0d208bcacb67c6d5ad283db1e33a90ff938450018896a483c2a1f73de49cdac668a4a37c50d572dfbbd2b2392f9b83012e9c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expressg-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
