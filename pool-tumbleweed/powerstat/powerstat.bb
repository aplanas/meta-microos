SUMMARY = "Laptop power measuring tool"
DESCRIPTION = "Powerstat measures the power consumption of a mobile PC that has a battery \
power source. The output is like vmstat but also shows power consumption \
statistics. At the end of a run, powerstat will calculate the average, \
standard deviation and min/max of the gathered data."
LICENSE = "GPL-2.0-only"

PV = "0.03.03"

RPM_NAME = "powerstat-0.03.03-1.1.aarch64.rpm"
RPM_HASH = "84c1338c3566f61bd95f8a5ebd42ce305176eaf669bbf1bf44cd8ccf0a3f7e100866c6f0a35021e84c8b3cdffde33c98bf11de8f5b9e48da11224af8d247c7a7"

RPROVIDES:${PN} += "powerstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
