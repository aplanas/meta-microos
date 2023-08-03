SUMMARY = "Documentation for texlive-rtkinenc"
DESCRIPTION = "This package includes the documentation for texlive-rtkinenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20003"

RPM_NAME = "texlive-rtkinenc-doc-2023.209.1.0svn20003-54.1.noarch.rpm"
RPM_HASH = "ffd49f674f9368f6c6ef4741b2361b07f159ea575d786e5f0f874af929b029e5be51cd3261a15634b4d376ff756a81d5f0959028c5b6bbadafb41cb2bb3f04fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rtkinenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
