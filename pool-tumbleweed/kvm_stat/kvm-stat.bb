SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kvm_stat-6.4.11-22.31.noarch.rpm"
RPM_HASH = "e956be1b8a08c737604359b116bcd6edbe44ab58fd56616000795285cfecdae2935ede32d1ae23854e7b72eb6974e552340894ff7aa81fd8fd279cf59ecb8ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
