SUMMARY = "Documentation for texlive-bxpapersize"
DESCRIPTION = "This package includes the documentation for texlive-bxpapersize"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn63174"

RPM_NAME = "texlive-bxpapersize-doc-2023.209.0.0.6svn63174-53.1.noarch.rpm"
RPM_HASH = "90709fde6b2f9fc766c206e67bb51b8846c083396f87c5d89f3f90212a7f99b8a49b4c6f26207a0b8134e525d82e50178ab9a9c5f4bde79cd17e0f0f485d0d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxpapersize-doc"

RDEPENDS:${PN} += ""

inherit rpm
