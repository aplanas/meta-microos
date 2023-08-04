SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "Files to develop with KDE's hotkey daemon module."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "khotkeys5-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "1dd23272e1e9a2df1aa5b16705dbfebbc2c455f346089ea6e06b55fb614bdeb6627e57bc2cd97fc96c552b85c3fd4f4368be313a78cc403de9c7c7595659405f"

RPROVIDES:${PN} += "cmake-KHotKeysDBusInterface \
khotkeys5-devel"

RDEPENDS:${PN} += "khotkeys5"

inherit rpm
