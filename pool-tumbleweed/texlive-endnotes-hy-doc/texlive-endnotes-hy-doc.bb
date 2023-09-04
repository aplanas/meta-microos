SUMMARY = "Documentation for texlive-endnotes-hy"
DESCRIPTION = "This package includes the documentation for texlive-endnotes-hy"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54758"

RPM_NAME = "texlive-endnotes-hy-doc-2023.209.svn54758-54.2.noarch.rpm"
RPM_HASH = "364c0bcc86e08f1cb41df79f85afe9abdae49c346e3070624a076439889f9da6ef23ca4c39ed71c1ed041827acc0f9ee731873c60f0d1709f12edfa43585a404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-hy-doc"

RDEPENDS:${PN} += ""

inherit rpm
