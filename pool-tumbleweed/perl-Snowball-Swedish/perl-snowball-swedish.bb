SUMMARY = "Porters stemming algorithm for swedish."
DESCRIPTION = "Porters stemming algorithm for swedish."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-Snowball-Swedish-1.2-14.25.noarch.rpm"
RPM_HASH = "0473ede5ab6296221e21054e8c084ce9d5385f764d45987bb625be25958f0ab22aa97bb4d51ba4fc66bfaf0e257dd8338f72f7b32a864ec067c904e4d9a2c523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::Stem::Snowball::Se) \
perl-Snowball-Swedish"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
