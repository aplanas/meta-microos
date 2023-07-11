SUMMARY = "Udev rules to grant logged in users DDC/CI access"
DESCRIPTION = "ddcutil allows to control monitor settings like brightness or \
color settings. \
 \
This sub-package contains udev rules granting access to the \
DDC/CI bus of connected displays for regular (non-root) users \
who are currently logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "ddcutil-i2c-udev-rules-1.4.1-2.2.noarch.rpm"
RPM_HASH = "a79e8da77b71bdaff5aedf0136df9731ce6170b82136d66e1e8412bdb225e425d90fec5e3124b6e49c1f8ac1438a14ca5c0c41b73dc0f7fa57a954aab82b52ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddcutil-/usr/lib/udev/rules.d/60-ddcutil.rules \
ddcutil-i2c-udev-rules"

RDEPENDS:${PN} += "libddcutil4"

inherit rpm
