SUMMARY = "Matcha Cinnamon themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the cinnamon themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "cinnamon-theme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "b3706c8b9a2a8def3978ad7d3716a3a7cb223611d7c806b24421286f26c104f553d971812ef20a26f1f76cace6ce8b575f84334169338aac3e0e8400c5749ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-matcha"

RDEPENDS:${PN} += "cinnamon \
metatheme-matcha-common"

inherit rpm
