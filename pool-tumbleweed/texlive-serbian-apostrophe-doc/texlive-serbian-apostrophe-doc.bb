SUMMARY = "Documentation for texlive-serbian-apostrophe"
DESCRIPTION = "This package includes the documentation for texlive-serbian-apostrophe"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23799"

RPM_NAME = "texlive-serbian-apostrophe-doc-2023.209.svn23799-54.1.noarch.rpm"
RPM_HASH = "4bed0f07dcaca8bb9e432441692627045a208944416da9d73fef76f7aed89ab50d638928bef65865b89c150e9206726e9a8e90cdd236d7eb12e56b48a725ad0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-apostrophe-doc"

RDEPENDS:${PN} += ""

inherit rpm
