SUMMARY = "Armenian (Հայերեն) Dictionary for Aspell"
DESCRIPTION = "An Armenian (Հայերեն) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0"

RPM_NAME = "aspell-hy-0.10.0-2.14.aarch64.rpm"
RPM_HASH = "c9cfb6c318c86a8450ef45803c7bcb263f3a559e3d4ddae5e2a7429e5a32e213dcc658fd5155980522544faa3adb19d2dee8583234adde4fddb6c3c944356788"

RPROVIDES:${PN} += "aspell-hy \
locale-aspell-hy"

RDEPENDS:${PN} += ""

inherit rpm
