SUMMARY = "Python CFFI bindings to the Brotli library"
DESCRIPTION = "Python CFFI bindings to the Brotli library"
LICENSE = "MIT"

PV = "1.0.9.2"

RPM_NAME = "python39-brotlicffi-1.0.9.2-2.1.aarch64.rpm"
RPM_HASH = "b9c57025243c74a4cf53f6dcf1e0fb64511003e241661f1872ef3276dfdcc73d640f7ce27fb42804f9a0ec521fb703a0f5aecbb7c56fd6972f6bd7f7276bc7c3"

RPROVIDES:${PN} += "python3.9dist-brotlicffi \
python39-brotlicffi \
python3dist-brotlicffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi"

inherit rpm
