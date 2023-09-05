SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kvm_stat-6.4.12-22.32.noarch.rpm"
RPM_HASH = "d54e713554c4b5611158fbc92f62aab9c6b64b190b7a90accda4f95e7d0f9c10d0e38725af29206c4c5a55af8328d5d3eec05d4f85a259547f190645eba7840f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
