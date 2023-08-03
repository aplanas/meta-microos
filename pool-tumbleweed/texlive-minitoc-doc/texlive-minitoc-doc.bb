SUMMARY = "Documentation for texlive-minitoc"
DESCRIPTION = "This package includes the documentation for texlive-minitoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.62svn61719"

RPM_NAME = "texlive-minitoc-doc-2023.209.62svn61719-55.1.noarch.rpm"
RPM_HASH = "5eb7ee7ed8e72e26582aa852281ffaaee190c6656a06e11b720b8b36c99b3144171ec604edc6196b07ae43a377f2cda4775daacaf519fd76d5d5b0ccdd68255d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-minitoc-doc-en \
texlive-minitoc-doc"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/sh"

inherit rpm
