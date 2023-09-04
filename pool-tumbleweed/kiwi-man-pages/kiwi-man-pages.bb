SUMMARY = "KIWI - manual pages"
DESCRIPTION = "Provides manual pages to describe the kiwi commands"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-man-pages-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "209b2ccd545e016dc77ce51e6acf286f20054b1f2ae382c4fb396da253bf4c0cfbf943107d7cd832334060c4b99cd3323c6f4cf3e64e023703168a776982282c"

RPROVIDES:${PN} += "config-kiwi-man-pages \
kiwi-man-pages"

RDEPENDS:${PN} += ""

inherit rpm
