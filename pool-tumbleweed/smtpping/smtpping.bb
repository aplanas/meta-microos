SUMMARY = "A tool for measuring SMTP server delay, delay variation and throughput"
DESCRIPTION = "A tool for measuring SMTP server delay, delay variation and throughput."
LICENSE = "GPL-2.0-only"

PV = "1.1.4"

RPM_NAME = "smtpping-1.1.4-1.7.aarch64.rpm"
RPM_HASH = "098662291925298275d1cc33fa71d8a9165e84d6a592610b10bb09a5853c24c9d49a7de74f8fbdf2a4e8217f785895b9ebde598cfc0b8bc909b194bdbc69c49c"

RPROVIDES:${PN} += "smtpping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
