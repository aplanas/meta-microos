SUMMARY = "Documentation for texlive-etexcmds"
DESCRIPTION = "This package includes the documentation for texlive-etexcmds"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn53171"

RPM_NAME = "texlive-etexcmds-doc-2023.209.1.7svn53171-53.1.noarch.rpm"
RPM_HASH = "2c49a606096de56ea6ba24f4a9fe4a03b8d6169548d846409af4541a08d6fbef13e4da0ab13877140f8ba9b9930e23ef43002067d66d7af1d4ce9b23399b56fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etexcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
