SUMMARY = "GTK+ 2 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 2 support of Greybird-geeko."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.1+git1.77c0887"

RPM_NAME = "gtk2-metatheme-greybird-geeko-3.23.1+git1.77c0887-3.1.noarch.rpm"
RPM_HASH = "db07bd35a2c2584040672fdb5806906721a5345b88bf4dbbf1f2f5dc2fb3e390aec6d40100f37afeca0b26ea9b9049a43100f001eec362724381fd6316b8aa95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-greybird-geeko"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-greybird-geeko-common"

inherit rpm
