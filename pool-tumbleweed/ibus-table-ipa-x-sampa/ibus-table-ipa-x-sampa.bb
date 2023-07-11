SUMMARY = "The ipa-x-sampa table for ibus-table"
DESCRIPTION = "ibus-table-ipa-x-sampa provides the ipa-x-sampa table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-ipa-x-sampa-1.3.16-1.1.noarch.rpm"
RPM_HASH = "a39a3f9d09465ca63bba7fc6e1c0686ca90c660a2fd9803e8188f1db3a465b203aaaa58de8de1a2eef62e23de0fbada811c88cfc559f48162a1c71934eb641e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-ipa-x-sampa"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
