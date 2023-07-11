SUMMARY = "Starter of deepin desktop"
DESCRIPTION = "deepin-start is used for launching DDE components and invoking user's \
custom applications which compliant with xdg autostart specification."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "deepin-start-5.9.49-3.1.aarch64.rpm"
RPM_HASH = "e1a8407db4a104318d6334d4adb89c86d137cd8ebdca18d6eb9b34db9afc53c370a4e1df864e997ff29e88c6d8f683ea84740798b2a7191c7723d6a23480d0c6"

RPROVIDES:${PN} += "deepin-start \
startdde"

RDEPENDS:${PN} += "/usr/bin/sh \
deepin-daemon \
update-alternatives"

inherit rpm
