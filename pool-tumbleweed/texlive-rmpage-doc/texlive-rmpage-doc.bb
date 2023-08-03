SUMMARY = "Documentation for texlive-rmpage"
DESCRIPTION = "This package includes the documentation for texlive-rmpage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-doc-2023.209.0.0.92svn54080-54.1.noarch.rpm"
RPM_HASH = "c279041a636dc3f46a5bdc449c679edcb4e495f0cefa389a84d77438e93e40f938527e06f86ba283bd1b7ae24b59a622fc355a6c720b1c1c912e80bbab93bbe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
