SUMMARY = "Documentation for texlive-barr"
DESCRIPTION = "This package includes the documentation for texlive-barr"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38479"

RPM_NAME = "texlive-barr-doc-2023.209.svn38479-54.1.noarch.rpm"
RPM_HASH = "43fbfa7336605637fd9c36c3cfa95d9bf359c1b3a8c0e7adfd249398aa872ef16584df300ee4a0c1c9d55b779fb7f6f0d1470a00175b3dbfd0e44770dc741dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barr-doc"

RDEPENDS:${PN} += ""

inherit rpm
