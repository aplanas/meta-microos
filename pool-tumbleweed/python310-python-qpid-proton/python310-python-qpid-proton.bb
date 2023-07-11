SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "python310-python-qpid-proton-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "6cd7b43d31a07048165c7733a4cab1f60c5fe27dbdc6c5934993e865bf1044bc386e1c8b1ac5023f00dcdaff59ee3fc2c0e811ae500a6f6eaf4bd593ca47379e"

RPROVIDES:${PN} += "python3.10dist-python-qpid-proton \
python310-python-qpid-proton \
python310-qpid-proton \
python3dist-python-qpid-proton"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libqpid-proton11 \
libssl.so.3 \
python-abi"

inherit rpm
