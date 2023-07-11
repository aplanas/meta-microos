SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kvm_stat-6.3.9-22.24.noarch.rpm"
RPM_HASH = "03d212140743086be547667f1e17f3690f91eee4a3998a93623a2c996b33099ca18dd5f66afa85b6dcd4bf998ea289733fdddd0d20f2a454328a4204a901f3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-curses"

inherit rpm
