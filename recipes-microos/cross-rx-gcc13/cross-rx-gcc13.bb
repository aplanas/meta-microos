SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-rx-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "1972c67b50de4393e2431449cbae631f97c47deabfb2c03022269c977ef694bf8f9f242509fcb4be30ffa4f402da8a94c2d57858d66854ce9a5f415520be83f8"

RPROVIDES:${PN} += "cross-rx-gcc13 cross-rx-gcc13(aarch-64) rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-rx-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
