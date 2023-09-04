SUMMARY = "Documentation for texlive-recycle"
DESCRIPTION = "This package includes the documentation for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-recycle-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "900a19337007feb00561cd72ca6eccef63702af35e5c65e9bbb599e022906ca8ba79d50def425ab63c47c46739306e1a288d5b6107dc4fb3ad81a80d9595f9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
