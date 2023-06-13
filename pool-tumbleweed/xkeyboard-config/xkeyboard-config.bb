SUMMARY = "The X Keyboard Extension"
DESCRIPTION = "The X Keyboard Extension essentially replaces the core protocol \
definition of keyboard. The extension makes possible to clearly and \
explicitly specify most aspects of keyboard behaviour on per-key basis \
and to more closely track the logical and physical state of the \
keyboard. It also includes a number of keyboard controls designed to \
make keyboards more accessible to people with physical impairments."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "2.38"

RPM_NAME = "xkeyboard-config-2.38-2.1.noarch.rpm"
RPM_HASH = "ee915cdb1d2f62af3edc2eda33326a86583e6607bfb7570c2b3d28fb96f80026d09b95c8b7aa1605ddc0c1f6858e468c4519d56acdb52021f6552203632763d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(xkeyboard-config) \
xkeyboard-config"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
coreutils"

inherit rpm
