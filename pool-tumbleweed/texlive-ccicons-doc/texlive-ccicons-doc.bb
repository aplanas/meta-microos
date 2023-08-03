SUMMARY = "Documentation for texlive-ccicons"
DESCRIPTION = "This package includes the documentation for texlive-ccicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54512"

RPM_NAME = "texlive-ccicons-doc-2023.209.1.6svn54512-53.1.noarch.rpm"
RPM_HASH = "3231b7346dd980eafe4427e52192fb3e2bf4f56e1271004293d3618a7468d64c0a72ff5c964d2376cac8b58bca0361ae02135c2a80f08d1deea2c3c3eb0d3c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
