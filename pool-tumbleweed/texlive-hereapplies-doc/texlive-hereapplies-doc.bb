SUMMARY = "Documentation for texlive-hereapplies"
DESCRIPTION = "This package includes the documentation for texlive-hereapplies"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-doc-2023.209.1.0.1svn65251-54.1.noarch.rpm"
RPM_HASH = "94851c618bed1e3e49d539aeb753a69b68e5080a8e417973c3bd74d966cd1a3e726aba008f7c0cd7ae6ddbfa2352b63392399dc8527b6c27bc8e619cd1a83b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hereapplies-doc"

RDEPENDS:${PN} += ""

inherit rpm
