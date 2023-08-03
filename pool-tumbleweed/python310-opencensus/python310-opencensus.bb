SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.2"

RPM_NAME = "python310-opencensus-0.11.2-1.1.noarch.rpm"
RPM_HASH = "2ace0650d445f389c1c7e7e50fd5272930c9e06846fce103f5b8c4da86d8ab829820ed50c8c89411a731c68bf5dbbc8f40c9811960749a8d131e1421414170d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opencensus \
python310-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-opencensus-context"

inherit rpm
