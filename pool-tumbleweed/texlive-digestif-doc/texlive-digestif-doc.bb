SUMMARY = "Documentation for texlive-digestif"
DESCRIPTION = "This package includes the documentation for texlive-digestif"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5.1svn65223"

RPM_NAME = "texlive-digestif-doc-2023.209.0.0.5.1svn65223-53.1.noarch.rpm"
RPM_HASH = "e3696d4e646fdafc78e924da5db3ff4c820ba870d772ea3f34c51dbdbac13c92c0a695298e537a198fe68503f78aeaf6cce22eff96d1a749bea6a24f263480d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digestif-doc"

RDEPENDS:${PN} += "/usr/bin/lua"

inherit rpm
