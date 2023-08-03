SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.2"

RPM_NAME = "python39-opencensus-0.11.2-1.1.noarch.rpm"
RPM_HASH = "d1a7ed2f44c74f723833ec0d3d62d875a5fecb12fbb6d452f238b1f617e778f73d12c638074282c42acd81d8717fb1763eaa113f6bdca6b20babe8f5705de354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opencensus \
python39-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-opencensus-context"

inherit rpm
