SUMMARY = "BitTorrent client"
DESCRIPTION = "EFL and libtorrent based BitTorrent client."
LICENSE = "GPL-3.0"

PV = "0.7.0"

RPM_NAME = "epour-0.7.0-1.18.aarch64.rpm"
RPM_HASH = "a24869b5e8893d691561a6da65fdad70425dba65c04823eaa828d8437842fb26f70808bbc1d28ec9bdec855f54f4dcf78622700944b3d4b69ae3142bf2c3a376"

RPROVIDES:${PN} += "epour \
python3.11dist-epour \
python3dist-epour"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dbus-python \
python3-efl \
python3-libtorrent-rasterbar \
python3-xdg"

inherit rpm
