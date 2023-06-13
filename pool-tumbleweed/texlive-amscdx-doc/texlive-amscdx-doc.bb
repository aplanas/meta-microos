SUMMARY = "Documentation for texlive-amscdx"
DESCRIPTION = "This package includes the documentation for texlive-amscdx"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2xsvn51532"

RPM_NAME = "texlive-amscdx-doc-2023.201.2.2xsvn51532-54.1.noarch.rpm"
RPM_HASH = "a238a48ac61d843897b7ea7cb81be6c32cc70687ee3b5fc9b50ab6f09b9722452dbfc79cb83d6e15d7be2f1493c636ad4794457804523ff3a31565f543f008ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amscdx-doc"

RDEPENDS:${PN} += ""

inherit rpm
