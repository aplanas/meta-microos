SUMMARY = "Documentation for texlive-urlbst"
DESCRIPTION = "This package includes the documentation for texlive-urlbst"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9.1svn65694"

RPM_NAME = "texlive-urlbst-doc-2023.209.0.0.9.1svn65694-54.1.noarch.rpm"
RPM_HASH = "7e703abebab41b9f6d3bec74bb0e72e0e2aa6d683be80e563010d90ef90fbbdd642a0b13fbb2bd197fdbbc14b2224d78485050074e1c501e84eee69b1266bfcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urlbst-doc"

RDEPENDS:${PN} += ""

inherit rpm
