SUMMARY = "Base configuration for gender programs and libraries"
DESCRIPTION = "Base configuration files needed by the gender and libgender packages"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-base-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "bd34e8293e0e3b50c43508609c562d017cc1263e6f0329f0043ab823ba9bda188c846df19fffd7ecb577f07928a3dd3c1b2375bbc8ac8cd55bc04d5980e2ea15"

RPROVIDES:${PN} += "config-genders-base \
genders-base"

RDEPENDS:${PN} += ""

inherit rpm
