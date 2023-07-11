SUMMARY = "A minimalist fan control program"
DESCRIPTION = "A simple fan control program. Read temperatures, check them against configured \
limits and switch to appropriate (also pre-configured) fan level. \
Requires a working thinkpad_acpi or any other hwmon driver \
that enables temperature reading and fan control from userspace. \
 \
Don't forget to set the desired temperature values in /etc/thinkfan.conf"
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "thinkfan-1.3.1-2.8.aarch64.rpm"
RPM_HASH = "bd80855af44c7cb2379f8c36597445c49741311bc83ade2a569b3f0278d7c4e43831a3897c1cf6082f6dae4d173b287965fc88149c6dfbe37001251d3236e635"

RPROVIDES:${PN} += "config-thinkfan \
thinkfan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-cpp.so.0.7"

inherit rpm
