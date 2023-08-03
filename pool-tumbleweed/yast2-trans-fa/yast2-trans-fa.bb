SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-fa-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "8738cc8015d6af0905b4200dd5fe924716b266e2b55edf90c484fa7647e0e66aab0ea2b75298e29e20af0ccba73e5a67a912e7283e8d50bec6ba626c5f8a06b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fa \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
