SUMMARY = "Fence Agents for High Availability"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This package provides both a Python API for \
creating agents as well as a collection of existing agents."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.12.1+git.1682325255.86f77326"

RPM_NAME = "fence-agents-4.12.1+git.1682325255.86f77326-2.1.aarch64.rpm"
RPM_HASH = "87b7bbbfa9b37c7a98e0974dc627738d6281b6afcd5bebcbe441de41df040bfa06b995ad0f2736ac39e32c42f8ec2c64f7f56c14d2e5e6e8fab5a8b75cfa3de1"

RPROVIDES:${PN} += "fence-agents"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
net-snmp \
openssh \
perl-Net-Telnet \
python3-pexpect \
python3-pycurl \
python3-requests \
sg3-utils \
telnet"

inherit rpm
