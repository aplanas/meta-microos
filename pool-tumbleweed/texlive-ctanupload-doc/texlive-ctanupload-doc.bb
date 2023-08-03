SUMMARY = "Documentation for texlive-ctanupload"
DESCRIPTION = "This package includes the documentation for texlive-ctanupload"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2csvn26313"

RPM_NAME = "texlive-ctanupload-doc-2023.209.1.2csvn26313-55.1.noarch.rpm"
RPM_HASH = "d2b68e57efc413a0a7b5a23ee7ac5418549d76c7d45aa5a5de5d008b6544b28bb8ce5bf9def2288b605716ee0d8d12999bec0788c2ef8cb6f65f0656823a722f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanupload-doc"

RDEPENDS:${PN} += ""

inherit rpm
