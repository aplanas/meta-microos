SUMMARY = "Documentation for texlive-gitfile-info"
DESCRIPTION = "This package includes the documentation for texlive-gitfile-info"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-doc-2023.209.0.0.5svn51928-54.2.noarch.rpm"
RPM_HASH = "a64dd50ee3f25e7f31088691b4dfe108dc6457cb149332dedccf882edc563a9d98a2bd6d2b82063cce790dc00085fa3a5f0073ac337d3bab9fd0d7fd5bbb14f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitfile-info-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
