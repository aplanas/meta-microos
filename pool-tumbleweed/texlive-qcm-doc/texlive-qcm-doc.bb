SUMMARY = "Documentation for texlive-qcm"
DESCRIPTION = "This package includes the documentation for texlive-qcm"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn63833"

RPM_NAME = "texlive-qcm-doc-2023.209.2.1svn63833-54.1.noarch.rpm"
RPM_HASH = "11cddb7180f8900aea0c33cb4dc65a9a22187b50bbf02679ffcea6741c4376c4903ea348a048ee9cd14466a9613867e2fd306b0e7fe174097cccddbd92ed56b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
