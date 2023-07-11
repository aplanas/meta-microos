SUMMARY = "Erbi input method"
DESCRIPTION = "Erbi input methods. Includes: \
Super Erbi (as erbi) \
and  Erbi Qin-Song (erbi-qs)"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-erbi-1.8.12-1.2.noarch.rpm"
RPM_HASH = "53f649e5f4c0aadbde7adb67ffab36fcdb8fd4b0b1006851b07fe968dac383b67489ffac16376a1f02b3130a592befe66ce0b7bf04c6093f577a40b40b2a327b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-erbi \
ibus-table-erbi \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
