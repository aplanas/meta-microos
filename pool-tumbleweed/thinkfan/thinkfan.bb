SUMMARY = "A minimalist fan control program"
DESCRIPTION = "A simple fan control program. Read temperatures, check them against configured \
limits and switch to appropriate (also pre-configured) fan level. \
Requires a working thinkpad_acpi or any other hwmon driver \
that enables temperature reading and fan control from userspace. \
 \
Don't forget to set the desired temperature values in /etc/thinkfan.conf"
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "thinkfan-1.3.1-2.9.aarch64.rpm"
RPM_HASH = "a9bc953b8ae1302e9c70cd46cd61d18f1e5888004e383b951231d36d2fe427b60751ea4dfcaf70256c7ffa1700f252a00ff9a41e712843cb2223be16ba34525f"

RPROVIDES:${PN} += "config-thinkfan \
thinkfan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-cpp.so.0.8"

inherit rpm
