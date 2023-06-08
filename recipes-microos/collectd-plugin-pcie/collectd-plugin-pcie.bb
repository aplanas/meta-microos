SUMMARY = "PCIe Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor PCIe errors."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-pcie-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "b6efcfa59a474bbd94458e5cace680b4338e79afb20ee56b53aa6dc17fb6853a024cd9b0a901d5623921db6b5c32d095d522bb1b8343afbf905a8caf08088ac1"

RPROVIDES:${PN} += "collectd-plugin-pcie collectd-plugin-pcie(aarch-64)"
RDEPENDS:${PN} += "collectd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
