SUMMARY = "Test files for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "qpid-proton-test-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "1f175143f46b1b80ed1dff0f4e85376c6a9598492ee87e72dad3c4c016b15af23d87ccf019d72722060e15872a150e3cf9990f5576f72d6d7574e8b986851371"

RPROVIDES:${PN} += "qpid-proton-test"

RDEPENDS:${PN} += ""

inherit rpm
