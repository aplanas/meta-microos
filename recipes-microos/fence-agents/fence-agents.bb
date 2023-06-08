SUMMARY = "Fence Agents for High Availability"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This package provides both a Python API for \
creating agents as well as a collection of existing agents."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.12.1+git.1682325255.86f77326"

RPM_NAME = "fence-agents-4.12.1+git.1682325255.86f77326-1.1.aarch64.rpm"
RPM_HASH = "ef1142d02af3bc51d6a9fcdc1cbe68be1b952fbf7370b0a561cb6ad2fdd905bfd76f7ace5c51d30422f46c4e5336556540f2a66dfa752e41dc04262efb6361a4"

RPROVIDES:${PN} += "fence-agents fence-agents(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) net-snmp openssh perl-Net-Telnet python3-pexpect python3-pycurl python3-requests sg3_utils telnet"

inherit rpm
