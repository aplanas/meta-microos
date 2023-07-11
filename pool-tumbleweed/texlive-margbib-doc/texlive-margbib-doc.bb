SUMMARY = "Documentation for texlive-margbib"
DESCRIPTION = "This package includes the documentation for texlive-margbib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0csvn15878"

RPM_NAME = "texlive-margbib-doc-2023.208.1.0csvn15878-53.1.noarch.rpm"
RPM_HASH = "a7544e91aa8432b4f03e54415705280777a8642e02f167743558f7322905f2e60f0574ad565d58f43cb502be0ac8648b76e0ee2237cb30eb7d318d7c058467a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-margbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
