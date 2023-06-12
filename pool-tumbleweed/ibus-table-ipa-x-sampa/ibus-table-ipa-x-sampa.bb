SUMMARY = "The ipa-x-sampa table for ibus-table"
DESCRIPTION = "ibus-table-ipa-x-sampa provides the ipa-x-sampa table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-ipa-x-sampa-1.3.13-2.3.noarch.rpm"
RPM_HASH = "bdd0a6f28b6c146ff427cd8b960970a267fa59774783c7162e3ed9f59f25f7f79c8872b7d11d5a640bb87697d796da2fa8d0a480e6aa56442038adb70d2b3f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-ipa-x-sampa"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
