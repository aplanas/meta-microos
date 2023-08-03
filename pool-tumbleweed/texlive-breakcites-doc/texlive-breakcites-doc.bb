SUMMARY = "Documentation for texlive-breakcites"
DESCRIPTION = "This package includes the documentation for texlive-breakcites"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21014"

RPM_NAME = "texlive-breakcites-doc-2023.209.svn21014-53.1.noarch.rpm"
RPM_HASH = "ba8fda0e7d09e98ed80c98a1b4e2cf5f6b3070f444c8d7b452fe2fd10c1af31dae7d62d5f46a642cd5a96252f27808655751327bbb06b913ebf02d9aa41ecc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breakcites-doc"

RDEPENDS:${PN} += ""

inherit rpm
