SUMMARY = "Documentation for texlive-harveyballs"
DESCRIPTION = "This package includes the documentation for texlive-harveyballs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn32003"

RPM_NAME = "texlive-harveyballs-doc-2023.201.1.1svn32003-53.2.noarch.rpm"
RPM_HASH = "255f4d70dba07afe709d45cf1a1e26c5d1e6767015717e917aaa5ae044f1b004f634f996626cb318d5fc75024c0194c813a189f43b7c409474fcba4bd2093981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harveyballs-doc"

RDEPENDS:${PN} += ""

inherit rpm
