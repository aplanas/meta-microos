SUMMARY = "Translations for QEMU"
DESCRIPTION = "This package contains a few language translations, particularly for the \
graphical user interface components that come with QEMU. The bulk of strings \
in QEMU are not localized."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-lang-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "657459b1b05b505a4c2a797aef8342426788437de699280fae6b03773ace11a9b0a62bd1212749825ccb00ffc2b176bd67062ec0031cd6a67b01368d987909b3"

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
