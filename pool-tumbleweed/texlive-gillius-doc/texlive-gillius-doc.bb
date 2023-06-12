SUMMARY = "Documentation for texlive-gillius"
DESCRIPTION = "This package includes the documentation for texlive-gillius"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64865"

RPM_NAME = "texlive-gillius-doc-2023.201.svn64865-52.1.noarch.rpm"
RPM_HASH = "00bd2c5768dcffd042bfcf183ce0db274e0f2d545e57e3061b4676a107b9e1e957526ebc67b1747bb9a57e0974195ffad7d9221e8a4169ec20f4bd5f96671dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gillius-doc"
RDEPENDS:${PN} += ""

inherit rpm
