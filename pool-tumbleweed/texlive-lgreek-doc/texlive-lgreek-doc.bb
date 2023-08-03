SUMMARY = "Documentation for texlive-lgreek"
DESCRIPTION = "This package includes the documentation for texlive-lgreek"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn21818"

RPM_NAME = "texlive-lgreek-doc-2023.209.svn21818-55.1.noarch.rpm"
RPM_HASH = "ca593911814b021b6cafcda7c47fc5e6da197f37a969b70508c85e4a592c31ec1d28dc9ebe81e6bf7d18aeeee89cff502b4119dd06b67423b8a55238b886ff39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
