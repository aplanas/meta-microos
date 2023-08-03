SUMMARY = "Documentation for texlive-mpfonts"
DESCRIPTION = "This package includes the documentation for texlive-mpfonts"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-mpfonts-doc-2023.209.svn54512-55.1.noarch.rpm"
RPM_HASH = "a80a072af9a19f5c42bdc4e1aeb8cc1489801ec667f0fd0c456863e9f953fe72c23c583d72547785074fa983a43a95adcedc11d2c9abed73e4997a6989397769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
