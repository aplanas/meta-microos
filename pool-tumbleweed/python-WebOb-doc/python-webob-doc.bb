SUMMARY = "WSGI request and response object - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebOb."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python-WebOb-doc-1.8.7-7.1.noarch.rpm"
RPM_HASH = "cb83640184fb50e4ee1a07eaf15ce2ae2fc626791a7d655fc21d306dc6750477f730590138cd9c9619da08e1bb5ad47c1060d082d465813c399baed13a845757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebOb-doc \
python310-WebOb-doc \
python311-WebOb-doc \
python39-WebOb-doc"

RDEPENDS:${PN} += ""

inherit rpm
