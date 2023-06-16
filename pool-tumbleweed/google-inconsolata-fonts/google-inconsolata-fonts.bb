SUMMARY = "Monospace Font Designed for Printed Code Listings"
DESCRIPTION = "Inconsolata Bold is a Unicode typeface family that supports \
languages that use the Latin script and its variants, and \
could be expanded to support other scripts. \
 \
Designer: Raph Levien"
LICENSE = "OFL-1.1"

PV = "3.000"

RPM_NAME = "google-inconsolata-fonts-3.000-1.9.noarch.rpm"
RPM_HASH = "74b39ec210a388a3959c596113882d2783b0be2aaa6db239d2a5449b1da279423fbc4c5983672fcf4e30bd4b11232fe7f230c831b0ae8404ddf8e996932a3dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-inconsolata-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
