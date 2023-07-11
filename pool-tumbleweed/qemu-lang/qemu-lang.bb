SUMMARY = "Translations for QEMU"
DESCRIPTION = "This package contains a few language translations, particularly for the \
graphical user interface components that come with QEMU. The bulk of strings \
in QEMU are not localized."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-lang-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "25dbdc3d60e793435df5ae4802f34542ada2c80a453a4c9a4a70444885c6c8b18667d693de9c99af9816f0d76ce6207cb342d1eefbc1ac7afef3f87788f47b18"

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
