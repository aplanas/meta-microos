SUMMARY = "A library for IP address lookup in Python"
DESCRIPTION = "Pytricia is a python module to store IP prefixes in a patricia tree. \
It's based on Dave Plonka's modified patricia tree code, and has three things \
to recommend it over related modules (including py-radix and SubnetTree)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-pytricia-1.0.2-3.14.aarch64.rpm"
RPM_HASH = "e19464464381cf743a908cdde6accadd94388bbe1125b2f07f6408046e7b9a690b3fa747182bbfab6c09e7d008bac294f0cc6cc8331be3ac8c483e72f81b3967"

RPROVIDES:${PN} += "python3-pytricia \
python3.11dist-pytricia \
python311-pytricia \
python3dist-pytricia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
