SUMMARY = "Translations for QEMU"
DESCRIPTION = "This package contains a few language translations, particularly for the \
graphical user interface components that come with QEMU. The bulk of strings \
in QEMU are not localized."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-lang-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "14c0286271aac911c973b1cf610d3cc94c067b8811baa7e91d5615ba6701f1fa01bcb2f18de0d46a8f22afe9389bd89e0b5b8c2b96233a3c160e17683e7d03b3"

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
