SUMMARY = "Server for remote device support for Soapy SDR"
DESCRIPTION = "A server that supports remote devices for the Soapy SDR. \
This package is intended to run on the system the sdr device is \
connected to."
LICENSE = "BSL-1.0"

PV = "0.5.2"

RPM_NAME = "soapy-remote-server-0.5.2-3.9.aarch64.rpm"
RPM_HASH = "18bedf2ce6c3b331fd276c0afac849c4512426149abc289bfcaf778d41606c96293db3b0db4536d913a331bc9b4b44a1069e772e0fa76eaae2ed1deb2cef6a6b"

RPROVIDES:${PN} += "soapy-remote-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
