SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python311-opencensus-0.11.0-1.4.noarch.rpm"
RPM_HASH = "58eeb1dc6f6a2acce05fd56b74c6e4238b9508186c7a263d85f832342a1f10647fb4f949d6fb882fabeafac3f47d710fc27a2af785fbe68a11ba60754c6148b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus \
python3.11dist-opencensus \
python311-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-opencensus-context"

inherit rpm
