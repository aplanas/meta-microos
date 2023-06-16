SUMMARY = "Documentation for texlive-mf2pt1"
DESCRIPTION = "This package includes the documentation for texlive-mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn61217"

RPM_NAME = "texlive-mf2pt1-doc-2023.201.2.7svn61217-54.1.noarch.rpm"
RPM_HASH = "a90da516b52a1da6d514092e8d30b6b7a8913c47d7acf955b189968db57280675febeb1a75e97df5b228aca6655e3ba9698c35d9f8d8ae6f56d8737f49bed0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mf2pt1-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
