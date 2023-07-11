SUMMARY = "Yawerty input method for IBus framework"
DESCRIPTION = "ibus-table-yawerty provides Yawerty input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-yawerty-1.3.16-1.1.noarch.rpm"
RPM_HASH = "07e5e41bca6059d27bffd52fbd79f000cc0bfc57ab92606f160aafd895344432f8110aa2516e630beccb07cb1600b2ddd05e4c40a75c9438bfa4c4416fed472a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-yawerty"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
