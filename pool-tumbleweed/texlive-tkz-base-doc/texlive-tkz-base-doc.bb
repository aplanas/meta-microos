SUMMARY = "Documentation for texlive-tkz-base"
DESCRIPTION = "This package includes the documentation for texlive-tkz-base"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2csvn66115"

RPM_NAME = "texlive-tkz-base-doc-2023.201.4.2csvn66115-52.1.noarch.rpm"
RPM_HASH = "9902537e6e8e22597eb561788c52cea908757c412e3a4b001653dc63410efcddd387d319ac3dd36d95ccba939ac16dda7595765a6e4910a526943e0d973614c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-base-doc-fr \
texlive-tkz-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
