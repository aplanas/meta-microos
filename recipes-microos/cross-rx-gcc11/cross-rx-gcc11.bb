SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-rx-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "323ed793d1c67f97a2efe0b1f471dd2b8888a849194059e609b8f7414073dd7c39b0f079c0ae70e7c6e90f4a1ad150cce7687d4a9a885b6672ff4e04016314f4"

RPROVIDES:${PN} += "cross-rx-gcc11 cross-rx-gcc11(aarch-64) rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-rx-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
