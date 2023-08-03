SUMMARY = "Documentation for texlive-jvlisting"
DESCRIPTION = "This package includes the documentation for texlive-jvlisting"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn24638"

RPM_NAME = "texlive-jvlisting-doc-2023.209.0.0.7svn24638-56.1.noarch.rpm"
RPM_HASH = "ed00256cfcb1da89cf08b1f0c085231d8750a87d53f7f6475a0115317c8d17e2819c6e877c2aa2c8fa5d21c9163af2135389f293dad8b262f87d3155a378f14f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jvlisting-doc"

RDEPENDS:${PN} += ""

inherit rpm
