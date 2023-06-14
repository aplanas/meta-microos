SUMMARY = "Python 3 binding for libftdi1"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters. \
 \
This package provides the python binding for libftdi."
LICENSE = "LGPL-2.1-only & GPL-2.0-only & GPL-2.0-with-classpath-exception"

PV = "1.5.12+git.0684c1b"

RPM_NAME = "python3-libftdi1-1.5.12+git.0684c1b-2.1.aarch64.rpm"
RPM_HASH = "843cb81211257b9657edc192d7360f361af60f596e9d6b6dd3b598185e1b903dbd7c398862496da930eb52f464120b9390a300fc7acead1f6607cf819b178a09"

RPROVIDES:${PN} += "python3-libftdi1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
python-abi"

inherit rpm
