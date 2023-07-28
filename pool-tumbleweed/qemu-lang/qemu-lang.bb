SUMMARY = "Translations for QEMU"
DESCRIPTION = "This package contains a few language translations, particularly for the \
graphical user interface components that come with QEMU. The bulk of strings \
in QEMU are not localized."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-lang-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "eed61f845faae8ecb7ae6769e63509267cf9deca86ccf9de1f67d39fe0c394ae6b7fdd4de10688054ded34eb192ff96890dab3e2f7d1bb12abb4d2101ccf21aa"

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
