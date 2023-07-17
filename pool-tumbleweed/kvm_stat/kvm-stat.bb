SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kvm_stat-6.4.2-22.25.noarch.rpm"
RPM_HASH = "2c8b99bcbac87ff807ca695c97520ddd19549439dc61449ba2d6f0aacba113aa903386afc3279e7f101d5174e6da41ae1db4319c3102ff2186c3c524c2ada358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
