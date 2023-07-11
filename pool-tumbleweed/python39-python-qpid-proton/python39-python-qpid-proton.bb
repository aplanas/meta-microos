SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "python39-python-qpid-proton-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "c1973c86f1a33b005eecc60c05e338164fbbbac02abda839b32dd4e4c41fdb6103e1826060f4f880ab937cc4ffbf3a738fd134a320b062963e77d2eb8dd1a05e"

RPROVIDES:${PN} += "python3.9dist-python-qpid-proton \
python39-python-qpid-proton \
python39-qpid-proton \
python3dist-python-qpid-proton"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libqpid-proton11 \
libssl.so.3 \
python-abi"

inherit rpm
