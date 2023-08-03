SUMMARY = "Documentation for texlive-cm-super"
DESCRIPTION = "This package includes the documentation for texlive-cm-super"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cm-super-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "f7ad9fd674d85e6f71e427bef30bfd9c72e25e74b84c8d6c201540f2670acaa622121c06170930936a08a0ac1b02b6d3e1cfa9f7779620ebfbc5fa0c80f93647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-super-doc"

RDEPENDS:${PN} += ""

inherit rpm
