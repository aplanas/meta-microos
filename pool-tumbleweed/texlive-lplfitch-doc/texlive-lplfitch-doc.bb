SUMMARY = "Documentation for texlive-lplfitch"
DESCRIPTION = "This package includes the documentation for texlive-lplfitch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn31077"

RPM_NAME = "texlive-lplfitch-doc-2023.209.0.0.9svn31077-55.1.noarch.rpm"
RPM_HASH = "9fed0ecdd7dd959132158c7fc4ecfe654d0eeabb1f1a78ffb1d9aa0091849d5e02058b6970f0c7df6a3650a1b25557d9e3089de40ba97f3459a1a38108b9881d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lplfitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
