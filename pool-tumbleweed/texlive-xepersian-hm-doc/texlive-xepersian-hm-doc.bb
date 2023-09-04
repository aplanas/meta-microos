SUMMARY = "Documentation for texlive-xepersian-hm"
DESCRIPTION = "This package includes the documentation for texlive-xepersian-hm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-doc-2023.209.1.1asvn56272-53.2.noarch.rpm"
RPM_HASH = "822e81d472426759c16d6eef30bfd3cc59927bb0a90d3859900a315218e184fd3b82d09164dd30cf4f797d7f5eac1346d88fa9b570395916a2ab04f1425ce8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xepersian-hm-doc-fa \
texlive-xepersian-hm-doc"

RDEPENDS:${PN} += ""

inherit rpm
