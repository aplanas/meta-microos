SUMMARY = "Instrument Control for Octave"
DESCRIPTION = "Low level I/O functions for serial, i2c, parallel, tcp, gpib, vxi11 and usbtmc interfaces. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "octave-forge-instrument-control-0.8.0-1.4.aarch64.rpm"
RPM_HASH = "022669fb9d0b2153d0d06e95d6678aa77e71220fd1fd85cbc918067ba3b0c94f4a03020f45ab6039320db7fae27731bc02aa665c1e680a136c343a5590f30964"

RPROVIDES:${PN} += "octave-forge-instrument-control"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli"

inherit rpm
