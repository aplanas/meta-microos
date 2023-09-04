SUMMARY = "Fish completion for glab"
DESCRIPTION = "Fish command line completion support for glab."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "glab-fish-completion-1.32.0-1.1.noarch.rpm"
RPM_HASH = "5cd14af0505248e17f50e233a3b2b326d1478b3f819f1dbc196a21d441f394c4ef8501607916bbdbe2ef93d0f6544e37bc4f2485e3b7207f85a0da117078e095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-fish-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
