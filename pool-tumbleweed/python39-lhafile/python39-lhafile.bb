SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-lhafile-0.2.2-1.26.aarch64.rpm"
RPM_HASH = "6d0890b3d8b6b974f4b98737748afc40a24911fbe615a39820675eb36e124bbbd2754e1592d48402ffc64f740deb21f0fffd3aa588ab160940097f2fc90a69cc"

RPROVIDES:${PN} += "python3.9dist-lhafile \
python39-lhafile \
python3dist-lhafile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
