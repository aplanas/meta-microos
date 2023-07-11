SUMMARY = "Porters stemming algorithm for swedish."
DESCRIPTION = "Porters stemming algorithm for swedish."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-Snowball-Swedish-1.2-14.26.noarch.rpm"
RPM_HASH = "a138140e43d0774ba6b3b353364efd841c807a34151058cb7453acbd6bcb1077c0ac83a73bf9187baff64f4fba699cf8f91d6cdccab2d3c4fc5720f7c2959f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--Se \
perl-Snowball-Swedish"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
