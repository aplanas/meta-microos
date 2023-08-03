SUMMARY = "Documentation for texlive-drm"
DESCRIPTION = "This package includes the documentation for texlive-drm"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.4svn38157"

RPM_NAME = "texlive-drm-doc-2023.209.4.4svn38157-53.1.noarch.rpm"
RPM_HASH = "6310324f79a19c551ade21c78f6ce0e7ca2126d59a5a6d05f99c4885a7242c24a32f5de24dcd0e3531c725ea4f03223f5f3e263bd7d189e280e1f7ba64f412f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drm-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/fontforge \
/usr/bin/sh"

inherit rpm
