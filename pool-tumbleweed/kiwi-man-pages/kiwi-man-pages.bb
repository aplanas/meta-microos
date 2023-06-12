SUMMARY = "KIWI - manual pages"
DESCRIPTION = "Provides manual pages to describe the kiwi commands"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-man-pages-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "f512394de070a6ea34af082928dcd870763c9098c662281274052d9b9e36751a788f887085d99318a5f0f1e871d27b7727bfdf28e61ac0e95e4a24c8108ffa57"

RPROVIDES:${PN} += "config(kiwi-man-pages) \
kiwi-man-pages \
kiwi-man-pages(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
