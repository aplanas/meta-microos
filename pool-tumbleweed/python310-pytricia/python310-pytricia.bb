SUMMARY = "A library for IP address lookup in Python"
DESCRIPTION = "Pytricia is a python module to store IP prefixes in a patricia tree. \
It's based on Dave Plonka's modified patricia tree code, and has three things \
to recommend it over related modules (including py-radix and SubnetTree)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-pytricia-1.0.2-3.14.aarch64.rpm"
RPM_HASH = "90a8b9d6a541c181b5040559c6cf1fca64011d82a06a5d5d0870875ff8313427256dda9e9cfe6a1738cd113fb0265e953b46973d12e9f453771cb250bcf980ae"

RPROVIDES:${PN} += "python3.10dist-pytricia \
python310-pytricia \
python3dist-pytricia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
