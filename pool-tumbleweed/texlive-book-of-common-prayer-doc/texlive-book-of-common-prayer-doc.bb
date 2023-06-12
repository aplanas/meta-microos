SUMMARY = "Documentation for texlive-book-of-common-prayer"
DESCRIPTION = "This package includes the documentation for texlive-book-of-common-prayer"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn62240"

RPM_NAME = "texlive-book-of-common-prayer-doc-2023.201.1.1.0svn62240-52.1.noarch.rpm"
RPM_HASH = "2c9d5038eb76f150e3e1434b8250e2211245bacec18d13640240706f8b50082dd934a10ebf66b9fd9e3bd781b5c35029d20f75780e7d62102c717b1fa00e935f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-book-of-common-prayer-doc"
RDEPENDS:${PN} += ""

inherit rpm
