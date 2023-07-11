SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python39-tri.struct-4.1.0-1.6.aarch64.rpm"
RPM_HASH = "7a138f7123f17b0e76a334ab3da67dc774dec5692c1df7c37754a840a8ad4c0d5fe51495b79a14c96c0a4c038054786de9cf3eeed641531d7d3e6507f1a5ecad"

RPROVIDES:${PN} += "python3.9dist-tri.struct \
python39-tri.struct \
python3dist-tri.struct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
