SUMMARY = "KIWI - Dracut module for vmx(+overlay) image type"
DESCRIPTION = "This package contains the kiwi-overlay dracut module which is used \
for booting vmx images built with KIWI and configured to use an \
overlay root filesystem"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-overlay-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "cbc4971a673618842c234d1bb155211afbb5953bf3a7a62b460b0c30a12b10aa2b1074f0ca896283d7acee49e384b44ddfbfac90f9bb31a074183efed6a3ffd1"

RPROVIDES:${PN} += "dracut-kiwi-overlay"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut \
dracut-kiwi-lib"

inherit rpm
