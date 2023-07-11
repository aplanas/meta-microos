SUMMARY = "Time Zone Descriptions"
DESCRIPTION = "These are configuration files that describe available time zones. You \
can select an appropriate time zone for your system with YaST."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2023c"

RPM_NAME = "timezone-2023c-1.2.aarch64.rpm"
RPM_HASH = "d65d8489c13d811f8a45e380295fdebda5e705cea7e733cec93c98f605c20e62ab0bb6437348efb8af0375305e6620126384899f22facafb7488e238af0cdd00"

RPROVIDES:${PN} += "config-timezone \
timezone"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
