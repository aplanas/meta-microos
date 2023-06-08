SUMMARY = "KIWI - Dracut module for oem(repart) image type"
DESCRIPTION = "This package contains the kiwi-repart dracut module which is \
used to repartition the oem disk image to the current disk \
geometry according to the setup in the kiwi image configuration"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "dracut-kiwi-oem-repart-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "986f963b037728cbbc1fc0bdd57736f4996ca8fc52e79f4888b4c4b7d08cd7ab23c0f93d5d3b437d626610c3f4b40c344af6165ff935b6d202af088e3705eb9e"

RPROVIDES:${PN} += "dracut-kiwi-oem-repart dracut-kiwi-oem-repart(aarch-64)"
RDEPENDS:${PN} += "/bin/bash dracut-kiwi-lib"

inherit rpm
