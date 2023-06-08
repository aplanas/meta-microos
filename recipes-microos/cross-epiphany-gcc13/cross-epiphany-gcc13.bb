SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-epiphany-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "97e108489b6ac398be17fc640e7a8ef58b72505983b26dc0d01c857698e879259ea784b7fa6c8213cad429e75af6a48101f29bd1d64cdad093362340944a64d6"

RPROVIDES:${PN} += "cross-epiphany-gcc13 cross-epiphany-gcc13(aarch-64) epiphany-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-epiphany-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
