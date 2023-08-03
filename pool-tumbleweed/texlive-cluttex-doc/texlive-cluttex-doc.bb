SUMMARY = "Documentation for texlive-cluttex"
DESCRIPTION = "This package includes the documentation for texlive-cluttex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5.1svn60964"

RPM_NAME = "texlive-cluttex-doc-2023.209.0.0.5.1svn60964-54.1.noarch.rpm"
RPM_HASH = "01c227ff489bc2b0639d97ef435957366c195fd342579ab00c32b4f1bf2a2ad428c91ee57cf804658886d401b0ab93424fda6aa66851ea4542412ee6e9e9ea71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cluttex-doc-ja;en \
texlive-cluttex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
