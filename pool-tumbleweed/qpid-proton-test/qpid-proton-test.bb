SUMMARY = "Test files for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "qpid-proton-test-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "b0b3e522f7fb638b840823b597d4c7f8a7e2568b43dcda11d00a45685ccc22655019dd5e2076e38cbea623d8f27e1982d791adb1359efd311c873a294e7de791"

RPROVIDES:${PN} += "qpid-proton-test \
qpid-proton-test(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
