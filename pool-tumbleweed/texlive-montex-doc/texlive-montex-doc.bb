SUMMARY = "Documentation for texlive-montex"
DESCRIPTION = "This package includes the documentation for texlive-montex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.ivu.04.092svn29349"

RPM_NAME = "texlive-montex-doc-2023.209.ivu.04.092svn29349-55.1.noarch.rpm"
RPM_HASH = "2da79090eddba3984178a5614f4d46fb6bcf0bcc6c5e132629610c4351f32b92cf2f52a385dbfea8f488349f396f479947160f3b7622e30d1705a2b91df13d8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-montex-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
