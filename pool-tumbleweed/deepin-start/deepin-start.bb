SUMMARY = "Starter of deepin desktop"
DESCRIPTION = "deepin-start is used for launching DDE components and invoking user's \
custom applications which compliant with xdg autostart specification."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "deepin-start-5.9.49-2.4.aarch64.rpm"
RPM_HASH = "52701c202f151b47e1e26534b64bed7790eb85fc6e2b9acd01ff055de26291d90619b7193e18a622e5d28843c391656f560b7f49e00d3a53cb059f5e3a636c25"

RPROVIDES:${PN} += "deepin-start \
startdde"

RDEPENDS:${PN} += "/bin/sh \
deepin-daemon \
update-alternatives"

inherit rpm
