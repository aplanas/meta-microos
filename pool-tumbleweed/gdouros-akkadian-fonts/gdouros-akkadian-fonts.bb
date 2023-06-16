SUMMARY = "Font with Support for Ancient Akkadian Scripts"
DESCRIPTION = "Akkadian covers the following scripts and symbols supported by \
The Unicode Standard: Basic Latin, Greek and Coptic, some \
Punctuation and other Symbols, Cuneiform, Cuneiform Numbers \
 and Punctuation."
LICENSE = "SUSE-Permissive"

PV = "7.17"

RPM_NAME = "gdouros-akkadian-fonts-7.17-1.16.noarch.rpm"
RPM_HASH = "c5f2bac3f58867e8656882144f2ec38e9f3e78791f5e88f62c198d11f2f758400dcdab58d240b4992d60d73d7d2c7a2ee43081edc979ccddcafe70621e8e564c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akkadian-fonts \
gdouros-akkadian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
