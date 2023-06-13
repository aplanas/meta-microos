SUMMARY = "A minimalist fan control program"
DESCRIPTION = "A simple fan control program. Read temperatures, check them against configured \
limits and switch to appropriate (also pre-configured) fan level. \
Requires a working thinkpad_acpi or any other hwmon driver \
that enables temperature reading and fan control from userspace. \
 \
Don't forget to set the desired temperature values in /etc/thinkfan.conf"
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "thinkfan-1.3.1-2.7.aarch64.rpm"
RPM_HASH = "51cac127273e41c91a85e97206d3e57aa960471c20a9c1607fe60b1f8796bc9ba45ab522d73f4a457b9a1e9ce18e4a246bda816544c224f69f5e59af0a7d2366"

RPROVIDES:${PN} += "config(thinkfan) \
thinkfan \
thinkfan(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libatasmart.so.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libyaml-cpp.so.0.7()(64bit)"

inherit rpm
