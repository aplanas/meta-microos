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

RPM_NAME = "perl-Set-Crontab-1.03-20.30.aarch64.rpm"
RPM_HASH = "72e03d43bb9560d4526a6abdecc0bb22051fbea70301cb889313c0a049491bab3824ba170d08d95dd400f6d4b498c51b95bea0f912a9bc6264d5e6b09cf2cbdf"

RPROVIDES:${PN} += "perl-Set--Crontab \
perl-Set-Crontab"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
