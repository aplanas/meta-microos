SUMMARY = "Pre-stretched versions of int10h-oldschoolpc-fonts"
DESCRIPTION = "This package contains aspect-corrected and non-corrected-but-stretched \
variants of the main font files."
LICENSE = "CC-BY-SA-4.0"

PV = "2.2"

RPM_NAME = "int10h-oldschoolpc-fonts-stretched-2.2-1.8.noarch.rpm"
RPM_HASH = "5604d85353f45be85517e7bf7fc601bdc46b17377f0426e3ee45d0d2b00e36f828b89290fe21665696501cab1523bf447ad0c4ccce44a84c4b046f2e5518d826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-int10h-oldschoolpc-fonts-stretched \
int10h-oldschoolpc-fonts-stretched"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
