SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-rx-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "4222e6a7488a1c0da82ef1b817dc9c2b9a39d21fc8e6bad2ac6807070a74ab5af9c3d6ee5c63594fce6ff0437490deb310c2c2ecfa5bf566c55d96a89cc82571"

RPROVIDES:${PN} += "cross-rx-gcc13 cross-rx-gcc13(aarch-64) rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-rx-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
