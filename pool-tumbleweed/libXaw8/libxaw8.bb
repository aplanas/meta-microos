SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw8-1.0.15-1.4.aarch64.rpm"
RPM_HASH = "32a77de9c09cc6ab77147fc54141609dd60d79c9b8fc28f7ba320a6440cc5bc6f344d9a57334f01607eb88d150b388d7d17877a398268c824e44b31ae990f0ab"

RPROVIDES:${PN} += "libXaw.so.8 \
libXaw8 \
libXaw8.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libXaw7"

inherit rpm
