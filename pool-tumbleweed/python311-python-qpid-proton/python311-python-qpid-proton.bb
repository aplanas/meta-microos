SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "python311-python-qpid-proton-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "54afe18de9395f3e1d3f7a20c9c753ef0902b235e3330e54fc516617e8c99cb7b760e08cf2d57ede8aee09aa3ee5a13cfd31e3692a1ab8347f78d43c28db8ff4"

RPROVIDES:${PN} += "python3-python-qpid-proton \
python3-qpid-proton \
python3.11dist-python-qpid-proton \
python311-python-qpid-proton \
python311-qpid-proton \
python3dist-python-qpid-proton"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpython3.11.so.1.0 \
libqpid-proton-core.so.10 \
libqpid-proton11 \
libssl.so.3 \
python-abi"

inherit rpm
