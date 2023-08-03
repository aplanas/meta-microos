SUMMARY = "Documentation for texlive-outliner"
DESCRIPTION = "This package includes the documentation for texlive-outliner"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.94svn21095"

RPM_NAME = "texlive-outliner-doc-2023.209.0.0.94svn21095-55.1.noarch.rpm"
RPM_HASH = "61cd1f669965936b42239ebad3356be9e2347894299d62ce7bbce1ead0ff519e87409ebfbe4bb7efe9f59d01ebd8449b0a1328292ce4d0370763fbd3a7de5edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outliner-doc"

RDEPENDS:${PN} += ""

inherit rpm
