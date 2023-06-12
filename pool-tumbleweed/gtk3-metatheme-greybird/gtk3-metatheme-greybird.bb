SUMMARY = "GTK+ 3 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 3 support of Greybird."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.2+git0.25f312f"

RPM_NAME = "gtk3-metatheme-greybird-3.23.2+git0.25f312f-2.1.noarch.rpm"
RPM_HASH = "b296b7a5252311d5605fa5a6eb5c7e368357da8784fa6aaad75bff47a0c9180cfe3e9832bde4403360c5208ca0e47a596630510a52040256be0d346a4c003044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-greybird"
RDEPENDS:${PN} += "metatheme-greybird-common"

inherit rpm
