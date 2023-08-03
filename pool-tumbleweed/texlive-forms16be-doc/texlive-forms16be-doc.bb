SUMMARY = "Documentation for texlive-forms16be"
DESCRIPTION = "This package includes the documentation for texlive-forms16be"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn51305"

RPM_NAME = "texlive-forms16be-doc-2023.209.1.3svn51305-53.1.noarch.rpm"
RPM_HASH = "a3c838827e97d83dd676cbdcd2f7784c3a00c77fd4c83272b375e541f173dd6d1b9fc19f9fb29d74c995cfb3e7a15c39b557b34b7c3abce03f3f87dbf37bd050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forms16be-doc"

RDEPENDS:${PN} += ""

inherit rpm
