SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "breeze-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "afda390d289d6fe600b9d5e35946debd9f18cd561860ed80f8e3726476a05ff1abc17ec511e065d9e87b644dd387c48092ef3954428524cb5307ec156b11334a"

RPROVIDES:${PN} += "breeze"

RDEPENDS:${PN} += "breeze5-cursors \
breeze5-icons \
breeze5-style"

inherit rpm
