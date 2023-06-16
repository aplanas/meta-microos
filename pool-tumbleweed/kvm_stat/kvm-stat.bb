SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kvm_stat-6.3.4-22.21.noarch.rpm"
RPM_HASH = "3bb139a56b2d126ce123e7e145dccfd28dcfb6e44ded7066e28f61d7c304323008687fb153e25ab746b488593f2d5a3a7d37a46fd93c3b281ac97e84d1442799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
