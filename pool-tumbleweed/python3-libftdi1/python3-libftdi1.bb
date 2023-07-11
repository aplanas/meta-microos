SUMMARY = "Python 3 binding for libftdi1"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters. \
 \
This package provides the python binding for libftdi."
LICENSE = "LGPL-2.1-only & GPL-2.0-only & GPL-2.0-with-classpath-exception"

PV = "1.5.12+git.0684c1b"

RPM_NAME = "python3-libftdi1-1.5.12+git.0684c1b-2.2.aarch64.rpm"
RPM_HASH = "c4113fdc4df98d7c307b504492756b538d3539b97dd0ff74ae2e2caa91418054041ae434fa7931440db9307fe5001313ad545da809f1d270d02634c7e7b4050f"

RPROVIDES:${PN} += "python3-libftdi1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
python-abi"

inherit rpm
