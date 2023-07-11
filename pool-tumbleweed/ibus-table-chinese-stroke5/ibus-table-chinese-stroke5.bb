SUMMARY = "Stroke 5 input method"
DESCRIPTION = "Stroke 5 input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-stroke5-1.8.12-1.2.noarch.rpm"
RPM_HASH = "9af9ee963312a92987a24ffcfa8d72d73bd3017f6c1fe532bbf2917cba8bba6e9712e6b5ea5733a8fb56266af351fbf1212fdc14f1f4863353fcf2432f568952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-stroke5 \
ibus-table-stroke5 \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
