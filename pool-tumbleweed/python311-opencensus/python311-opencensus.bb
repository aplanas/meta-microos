SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python311-opencensus-0.11.0-1.3.noarch.rpm"
RPM_HASH = "fa38ef3314e2eb439c53b167c209482325a2436d1276a7456e7a8a2365b2c26b90c7e49318f1694fca350a74fcdeddb93ac7e5a795733804b3d477eba3a1d006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(opencensus) \
python311-opencensus \
python3dist(opencensus)"

RDEPENDS:${PN} += "python(abi) \
python311-google-api-core \
python311-opencensus-context"

inherit rpm
