SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-misaka-2.1.1-2.19.aarch64.rpm"
RPM_HASH = "012b28aacbae20b4334e6dc45a441797524676fa3173d9f1bc1e9560fe17b89ad1ed18d3f7f78c78329c3aa650a9bde27d0feaf08175b35228847b3e228df0de"

RPROVIDES:${PN} += "python3.9dist-misaka \
python39-misaka \
python3dist-misaka"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi \
update-alternatives"

inherit rpm
