SUMMARY = "Top Like UI to Show Per-Process I/O Going on"
DESCRIPTION = "Linux has always been able to show how much I/O was going on (the bi \
and bo columns of the vmstat 1 command). \
 \
Iotop is a Python program with a UI similar to top to show on behalf of \
which process is the I/O going on."
LICENSE = "GPL-2.0-only"

PV = "0.6git.20220308"

RPM_NAME = "iotop-0.6git.20220308-1.3.aarch64.rpm"
RPM_HASH = "cbdc2c31b557f2df554830ef2f8c80880b18cc5a44ba9ea445a07ee522def7a83c83c413b075daacf8c90c81325b2393c5f2ef6a66d9c0e0b3ea7923e2aabe8d"

RPROVIDES:${PN} += "iotop \
python3.11dist-iotop \
python3dist-iotop"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-curses"

inherit rpm
