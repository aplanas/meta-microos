SUMMARY = "Documentation for texlive-context-gantt"
DESCRIPTION = "This package includes the documentation for texlive-context-gantt"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-gantt-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "58d91652fe3a8d4c89be3bd7293bf42053676379a190b69736395fba69022a0339934f317f1fa81b3091d8bb30197c3cf320ced47ab01f23b373c32b1c876d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gantt-doc"

RDEPENDS:${PN} += ""

inherit rpm
