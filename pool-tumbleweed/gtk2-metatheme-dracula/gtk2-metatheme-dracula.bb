SUMMARY = "GTK+ 2 support for the Dracula theme"
DESCRIPTION = "This package provides the GTK+ 2 support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "gtk2-metatheme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "a7c06e183df25c3011996167848ea2d0841dd567e85dd1d53cc49318bcf539d977e30ebff8b6fb9b6d27ea4acdf493c605325235f645227bcadce948dc6ac016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
gtk2-metatheme-dracula"

RDEPENDS:${PN} += "metatheme-dracula-common"

inherit rpm
