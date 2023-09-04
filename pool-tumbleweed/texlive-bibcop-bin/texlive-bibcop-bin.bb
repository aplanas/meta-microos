SUMMARY = "Binary files of bibcop"
DESCRIPTION = "Binary files of bibcop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65257"

RPM_NAME = "texlive-bibcop-bin-2023.20230311.svn65257-93.2.aarch64.rpm"
RPM_HASH = "f0b2acb89f55654b50180dde7c0c2ab33def7ec75f6b0ac98febe59ba3bcdc0527af0050c8b1a0e79529d0da03ef27a2ac8c4723b84e840158362339b5b19629"

RPROVIDES:${PN} += "texlive-bibcop-bin"

RDEPENDS:${PN} += "texlive-bibcop"

inherit rpm
