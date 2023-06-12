SUMMARY = "Documentation for texlive-endnotes-hy"
DESCRIPTION = "This package includes the documentation for texlive-endnotes-hy"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54758"

RPM_NAME = "texlive-endnotes-hy-doc-2023.201.svn54758-53.1.noarch.rpm"
RPM_HASH = "975fba63a57a9870c1fbb96a7f4080ed83963a64ff8f1e10f9471d5fd62a6d731010e702336f17b699a278ccc9043be4019e594f75667573e4f3ab2b3072e37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-hy-doc"
RDEPENDS:${PN} += ""

inherit rpm
