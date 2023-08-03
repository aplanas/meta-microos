SUMMARY = "Documentation for texlive-pdftex-quiet"
DESCRIPTION = "This package includes the documentation for texlive-pdftex-quiet"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.0svn49169"

RPM_NAME = "texlive-pdftex-quiet-doc-2023.209.1.1.0svn49169-52.1.noarch.rpm"
RPM_HASH = "a9d59566f55dd65005f365bd12811bcd33e647ad9db789b8171cbc0148d1ba80d9ecd077e4de4648c9c9f7bb3897ee90abdd052aa8828a1f39b06b2809233161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftex-quiet-doc"

RDEPENDS:${PN} += ""

inherit rpm
