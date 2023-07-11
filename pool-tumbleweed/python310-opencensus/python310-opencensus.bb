SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python310-opencensus-0.11.0-1.4.noarch.rpm"
RPM_HASH = "2b8f94c5c167e142674ae32683d63b2779e0c23e6de1b60ca881f15d898078b6d20e9f139ceab87a681d7a0950fc72b531afb3592dea37655ed01dfb1f11a298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opencensus \
python310-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-opencensus-context"

inherit rpm
