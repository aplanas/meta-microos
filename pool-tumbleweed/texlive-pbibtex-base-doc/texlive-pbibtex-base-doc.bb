SUMMARY = "Documentation for texlive-pbibtex-base"
DESCRIPTION = "This package includes the documentation for texlive-pbibtex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66085"

RPM_NAME = "texlive-pbibtex-base-doc-2023.209.svn66085-52.1.noarch.rpm"
RPM_HASH = "9ea6afe8745a4b6477526b902424e2314a2407cfeac94a71d554c16fa8d02911d6967408a37e7ee2449091c5fe4e62af4d898ba9e6741a2d7daebfe8dbcfc4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-base-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
