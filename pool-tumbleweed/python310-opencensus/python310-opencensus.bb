SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python310-opencensus-0.11.0-1.3.noarch.rpm"
RPM_HASH = "231f935fc80cf64e9a58649d813290f0a2d06fdc702d48714497fb61c74ea81a9f63066f01fbcf1e42ceb39677a93018887a9774372b129798c9bbcd3094bc04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus \
python3.10dist(opencensus) \
python310-opencensus \
python3dist(opencensus)"
RDEPENDS:${PN} += "python(abi) \
python310-google-api-core \
python310-opencensus-context"

inherit rpm
