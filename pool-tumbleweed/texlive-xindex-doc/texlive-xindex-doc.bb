SUMMARY = "Documentation for texlive-xindex"
DESCRIPTION = "This package includes the documentation for texlive-xindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.47svn65597"

RPM_NAME = "texlive-xindex-doc-2023.209.0.0.47svn65597-53.1.noarch.rpm"
RPM_HASH = "dccec3bfeb7f168c0f682a85ceb1e3cf29bbfc6425b922dda9cbe17cf57aadcfc88bd787f6dda66b9d8c9f70af1eb8b56ab775ec6390cd330669ee0b6c65bfc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xindex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
