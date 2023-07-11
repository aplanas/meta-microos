SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "Files to develop with KDE's hotkey daemon module."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "khotkeys5-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "bb76662539dc91a0cc1aa5157ca71cb68ede75ff5562f5889ee9215c9ce4e5f414efeb90d234eb757c7224694d0cfa436318e51a670e487f6564f827034aa9dc"

RPROVIDES:${PN} += "cmake-KHotKeysDBusInterface \
khotkeys5-devel"

RDEPENDS:${PN} += "khotkeys5"

inherit rpm
