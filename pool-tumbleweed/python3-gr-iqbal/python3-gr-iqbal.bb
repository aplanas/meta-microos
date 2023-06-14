SUMMARY = "Python bindings for gr-iqbal"
DESCRIPTION = "The Python Bindings for gr-iqbal."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "python3-gr-iqbal-0.39.0git20210108-1.12.aarch64.rpm"
RPM_HASH = "098a7aa06ff51a1633960a613afc49c986d7dd2c8130836dd9bbdde88585ca62cd714fd7a37d9442f1fa0ad4b0a91c051cdc72e731ce04ed065ec2dd11380249"

RPROVIDES:${PN} += "python3-gr-iqbal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-iqbalance3-9-0 \
libgnuradio-runtime.so.3.10.6 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
