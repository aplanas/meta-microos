SUMMARY = "Binary files of listbib"
DESCRIPTION = "Binary files of listbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn26126"

RPM_NAME = "texlive-listbib-bin-2023.20230311.svn26126-92.1.aarch64.rpm"
RPM_HASH = "e03e056fc6b539889b308c823844170f647788f302ec12998368b91bd000c11b6cb80ef1077e537987545e0d62ff2de7e52769cc958291eb67d8f3f25c65b016"

RPROVIDES:${PN} += "texlive-listbib-bin"

RDEPENDS:${PN} += "texlive-listbib"

inherit rpm
