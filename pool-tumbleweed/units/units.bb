SUMMARY = "Conversion Utility"
DESCRIPTION = "The 'units' program converts quantities expressed in various scales to \
their equivalents in other scales. \
 \
Units can also convert temperature values (Fahrenheit to Celsius, for \
example) but this needs a slightly different input syntax. See the man \
page for details."
LICENSE = "GPL-3.0-or-later"

PV = "2.22"

RPM_NAME = "units-2.22-1.4.aarch64.rpm"
RPM_HASH = "2b512198a55ca6f03139d36edd22ea11bfbe0e37c5133bd81a445eb7a7165fb4d8d62c04d10d3873732dfd5ae67dc8568772326953080f918c5e773fea79e06c"

RPROVIDES:${PN} += "units"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
python3-requests"

inherit rpm
