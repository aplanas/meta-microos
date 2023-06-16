SUMMARY = "Documentation for texlive-xindex"
DESCRIPTION = "This package includes the documentation for texlive-xindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.47svn65597"

RPM_NAME = "texlive-xindex-doc-2023.201.0.0.47svn65597-52.1.noarch.rpm"
RPM_HASH = "287cac560359c2ed98605da1d249dc5a34819cb45f3356c8c75899a9095633ac7c5b097e2c9354bde03a17e67beb1c0abea6c826fceadc5bf4c7c59696e00b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xindex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
