SUMMARY = "Expand crontab(5)-style integer lists"
DESCRIPTION = "Set::Crontab parses crontab-style lists of integers and defines some \
utility functions to make it easier to deal with them. \
 \
 \
 \
Authors: \
-------- \
    Abhijit Menon-Sen <ams@wiw.org>"
LICENSE = "Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-Set-Crontab-1.03-20.31.aarch64.rpm"
RPM_HASH = "4a3338a1ca37418de2193f27b2b702150145a725bc50b04778eec9d6da9e017df15f23797dfa99f7b89b7d17a7d1ab0bd27a594eecc69b6fa47febfe32cc91c4"

RPROVIDES:${PN} += "perl-Set--Crontab \
perl-Set-Crontab"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
