SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-arm-none-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "3d964b4e0e03f823159dfc631031f1084572b20f45da78c67e1860b70898d3b8af4d3b93e19974d640cb8e49b5b7fb71a5898a8e102c6eb3537be22ff82a65d5"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc11 cross-arm-none-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
