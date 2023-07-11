SUMMARY = "Python bindings for gr-iqbal"
DESCRIPTION = "The Python Bindings for gr-iqbal."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "python3-gr-iqbal-0.39.0git20210108-1.13.aarch64.rpm"
RPM_HASH = "aa3aafcb75c90386dd5a1d5b29e0dba2d072878470d916d9ff0e0b8e359addc8b92c7297a84072db762f1b1c762d6b0d8a427ebf11bf0888bbbdc7ba5e39a8b2"

RPROVIDES:${PN} += "python3-gr-iqbal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-iqbalance3-9-0 \
libgnuradio-runtime.so.3.10.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
