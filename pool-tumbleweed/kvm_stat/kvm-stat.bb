SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kvm_stat-6.4.6-22.28.noarch.rpm"
RPM_HASH = "c2c05aebf72a0156ccdf93813e1256940e9d83fad5a80415c8cd6dc4b75e70a00470d7565748cb75c112a4ce05a9a7590f0d43d95647f712bb3ddb713127996f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
