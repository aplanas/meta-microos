SUMMARY = "Documentation for texlive-pst-geometrictools"
DESCRIPTION = "This package includes the documentation for texlive-pst-geometrictools"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn61430"

RPM_NAME = "texlive-pst-geometrictools-doc-2023.209.1.3svn61430-53.1.noarch.rpm"
RPM_HASH = "fa15ad2222b03c65f9877215b7b215b1f3267cf6f1fdde1daa54e79d4261148ffe7ad57567e40671fcc936556791b9a9d11d5e1796ed3aec09ddc15e2a3f54fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-geometrictools-doc-fr \
texlive-pst-geometrictools-doc"

RDEPENDS:${PN} += ""

inherit rpm
