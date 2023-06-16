SUMMARY = "League Of Movable Type's 'Sniglet' font"
DESCRIPTION = "A rounded display face intended primarily for headlines. It comes \
with a full Latin character set."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-sniglet-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "9c7c0413bc6e31af5224ecfad515be88e53c3590f0d7868b6398e00b78e27469990cb3251672c1099575cf1295cbaf5f786741400ad94e7d73fe0a9dd99c7d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-sniglet-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
