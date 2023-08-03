SUMMARY = "Documentation for texlive-boldtensors"
DESCRIPTION = "This package includes the documentation for texlive-boldtensors"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-boldtensors-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "d21fae8cbab80175aa8473924adbfa68ed2a7d08f8675041595b9d3b1dd98ed25e77ee8fb66b9f5150da4f36df3b39c40360d51801ae44e22497df35c23ff4c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boldtensors-doc"

RDEPENDS:${PN} += ""

inherit rpm
