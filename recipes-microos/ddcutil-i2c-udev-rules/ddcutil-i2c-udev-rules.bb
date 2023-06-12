SUMMARY = "Udev rules to grant logged in users DDC/CI access"
DESCRIPTION = "ddcutil allows to control monitor settings like brightness or \
color settings. \
 \
This sub-package contains udev rules granting access to the \
DDC/CI bus of connected displays for regular (non-root) users \
who are currently logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "ddcutil-i2c-udev-rules-1.4.1-2.1.noarch.rpm"
RPM_HASH = "dca0d2c602030aee67675c3333398bce3d0e6002bf6d2fc175f4837a5a724bbd7024a8b1802a334d562886df3b610d9999658570f6a3bb9294688346af734b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddcutil-i2c-udev-rules ddcutil:/usr/lib/udev/rules.d/60-ddcutil.rules"
RDEPENDS:${PN} += "libddcutil4"

inherit rpm
