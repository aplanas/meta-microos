SUMMARY = "Open-source Russian GOST Fonts (OpenType Format)"
DESCRIPTION = "Open-source version of the fonts by Russian standard GOST 2.304-81 \
«Letters for drawings». \
 \
This package contains fonts in OpenType format."
LICENSE = "OFL-1.1"

PV = "0.3"

RPM_NAME = "opengost-otf-fonts-0.3-7.18.noarch.rpm"
RPM_HASH = "587d3fb05266bb3dff3da997f77a2eeeaddd05a9c9b9b3d55b9c27804bbeef8b2125e2ed831d4363d9aca3c805544c32f277da4d40d2f42581078a75a8831a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengost-otf-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
