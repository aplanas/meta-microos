SUMMARY = "Documentation for texlive-preview"
DESCRIPTION = "This package includes the documentation for texlive-preview"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.13.1svn62130"

RPM_NAME = "texlive-preview-doc-2023.201.13.1svn62130-52.1.noarch.rpm"
RPM_HASH = "a411c1b4e361058106f37c381b3ac5aec24e65189c7869c338d9593f9cb921faadd690ac500ef859580d6787c5b10f5ad00dbc2249339602e4d94e7f3f72b700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-preview-doc"
RDEPENDS:${PN} += ""

inherit rpm
