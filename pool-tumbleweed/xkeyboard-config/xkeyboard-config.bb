SUMMARY = "The X Keyboard Extension"
DESCRIPTION = "The X Keyboard Extension essentially replaces the core protocol \
definition of keyboard. The extension makes possible to clearly and \
explicitly specify most aspects of keyboard behaviour on per-key basis \
and to more closely track the logical and physical state of the \
keyboard. It also includes a number of keyboard controls designed to \
make keyboards more accessible to people with physical impairments."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "2.39"

RPM_NAME = "xkeyboard-config-2.39-1.1.noarch.rpm"
RPM_HASH = "2ae3fe3bb8928a412df9e0964fe7e0e9d4842ad6974d81040bd678961d076fb300315740db1f62ca4d62fda6aa8da49d07a21dab818846b5903dad5b028c22bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xkeyboard-config \
xkeyboard-config"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils"

inherit rpm
