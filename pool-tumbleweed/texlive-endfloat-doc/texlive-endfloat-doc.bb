SUMMARY = "Documentation for texlive-endfloat"
DESCRIPTION = "This package includes the documentation for texlive-endfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.7svn57090"

RPM_NAME = "texlive-endfloat-doc-2023.201.2.7svn57090-53.1.noarch.rpm"
RPM_HASH = "2c16e9d292b608d0d0338a1b5198ac7af1ba9bf633e85ef3f639cfa06affa526739819b1b2810e5c96369419418f961dcff2fa72108627447e6b089ed447c73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
