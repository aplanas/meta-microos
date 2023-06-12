SUMMARY = "Arabic Bitmap Font"
DESCRIPTION = "Misc Fixed family with arabic symbols."
LICENSE = "SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "arabic-bitmap-fonts-1.0-18.15.noarch.rpm"
RPM_HASH = "49a0aa138b7a34f568e333c21e71575353c0a026d121e01de589b530ec16535d4a6a7b9d09713b0a9436a9d285810d505ddeb3513e38afdf943a3adeabb7e367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-bitmap-fonts \
locale(ar)"
RDEPENDS:${PN} += ""

inherit rpm
