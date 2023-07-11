SUMMARY = "A library for IP address lookup in Python"
DESCRIPTION = "Pytricia is a python module to store IP prefixes in a patricia tree. \
It's based on Dave Plonka's modified patricia tree code, and has three things \
to recommend it over related modules (including py-radix and SubnetTree)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-pytricia-1.0.2-3.14.aarch64.rpm"
RPM_HASH = "27bed35d625637692000c6cc455a9764c47793bedf7feda589078fc512d3efbbb0d5db69e8cb3d2bd438324b483cf5bee3e7cb40c731244bfb39e09eed976e09"

RPROVIDES:${PN} += "python3.9dist-pytricia \
python39-pytricia \
python3dist-pytricia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
