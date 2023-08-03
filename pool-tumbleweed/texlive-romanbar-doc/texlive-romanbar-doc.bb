SUMMARY = "Documentation for texlive-romanbar"
DESCRIPTION = "This package includes the documentation for texlive-romanbar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn25005"

RPM_NAME = "texlive-romanbar-doc-2023.209.1.0fsvn25005-54.1.noarch.rpm"
RPM_HASH = "e6ea1b4c2fda42c6741907519889c51c7fd565a7118e72616ed04f2740f7bc9554bb1195df3cb0cf725dbb52558dfc634289036822ec793ac8cba99531f2e4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
