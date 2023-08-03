SUMMARY = "Fence Agents for High Availability"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This package provides both a Python API for \
creating agents as well as a collection of existing agents."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.12.1+git.1690196437.64f62dbb"

RPM_NAME = "fence-agents-4.12.1+git.1690196437.64f62dbb-1.1.aarch64.rpm"
RPM_HASH = "de88d382cb15433aa8c7f37b93e7e6dce354c27ac1729a61117fe4870134abc64f83cbc8cabe4c25d0c7a6a57b3aa9fc2ebdfc06f4be60ccdc10e60f20ad782d"

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
