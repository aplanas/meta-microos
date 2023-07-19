SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kvm_stat-6.4.3-22.26.noarch.rpm"
RPM_HASH = "5557de9d6c86055f40c886d9499f5388e39d1528a33c80918b6eadddcfb1a45bc2c22cdfb1effc87358dd163d8bf3b081e4705fe0087bd23e6d24a6205f174c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
