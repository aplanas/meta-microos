SUMMARY = "Translations for QEMU"
DESCRIPTION = "This package contains a few language translations, particularly for the \
graphical user interface components that come with QEMU. The bulk of strings \
in QEMU are not localized."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-lang-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "a8a7a1835db2d7d3c3c90d8de3edfd2da766a80b352367f531ee97690ee99cd4f32c02081ee59706b409f6b5a94fc71b32e74b1edc218515f11e54617e179e4d"

RPROVIDES:${PN} += "locale-qemu-bg \
locale-qemu-de-DE \
locale-qemu-fr-FR \
locale-qemu-hu \
locale-qemu-it \
locale-qemu-sv \
locale-qemu-tr \
locale-qemu-uk \
locale-qemu-zh-CN \
qemu-lang"

RDEPENDS:${PN} += ""

inherit rpm
