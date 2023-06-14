SUMMARY = "Japanese Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Japanese data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-ja-2.10.0-2.5.noarch.rpm"
RPM_HASH = "060235ea3646016af982ab800f3c48be2fa11b5d5bed8314ea6f8b9bde614930e32d12bc33a2b82eecfb7de5905925439b91a5ef835a8b0d5b5503eb149e732a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-ja \
locale-gimp-help-ja"

RDEPENDS:${PN} += "gimp-help"

inherit rpm
