SUMMARY = "Python bindings for gr-iqbal"
DESCRIPTION = "The Python Bindings for gr-iqbal."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "python3-gr-iqbal-0.39.0git20210108-1.14.aarch64.rpm"
RPM_HASH = "10e479fa7cecac779dde9acf0cd25fc28600ffe6208941ca6662d53a33164e2e996029ca355e8a9e5752aafa18b502a7270df3172bc76eb4bf3156a7fe09abed"

RPROVIDES:${PN} += "python3-gr-iqbal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-iqbalance3-9-0 \
libgnuradio-runtime.so.3.10.7 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
