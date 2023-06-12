SUMMARY = "Active Directory Users and Computers for YaST"
DESCRIPTION = "The Active Directory Users and Computers for YaST module provides tools for \
creating and modifying Users, Groups, and Computer objects in Active Directory."
LICENSE = "GPL-3.0-only"

PV = "2.2"

RPM_NAME = "yast2-aduc-2.2-1.11.noarch.rpm"
RPM_HASH = "7a6af13ea1c581cdb90cc264384eb675d526b406f95365bde9bf905bae2abae1551e9f97ac92ab3e00b853325a8785d36fdebaf46312bbd0b8727b9f4f05b190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.ADUC.desktop) \
yast-aduc \
yast2-aduc"
RDEPENDS:${PN} += "/usr/bin/env \
krb5-client \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
