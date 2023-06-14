SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-misaka-2.1.1-2.17.aarch64.rpm"
RPM_HASH = "c483774206250c8b431fe094831c82d2765cd1e5bd254bb22fd09bf0a37dbb8b501fede460f41f3054fbe7c7795eeb4651e214338c4ac63f0145b42010a1b5c8"

RPROVIDES:${PN} += "python3.11dist-misaka \
python311-misaka \
python3dist-misaka"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi \
update-alternatives"

inherit rpm
