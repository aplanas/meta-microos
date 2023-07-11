SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python39-opencensus-0.11.0-1.4.noarch.rpm"
RPM_HASH = "a7e4fbc93db5ced6d55e9227b85e82fb050c26636c0aa96a6b4d5820d368e0541d26f6d0cc67bc043bbe2dfd5ba70755f9cfc37db780083b6c6b5a05e14a8ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opencensus \
python39-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-opencensus-context"

inherit rpm
