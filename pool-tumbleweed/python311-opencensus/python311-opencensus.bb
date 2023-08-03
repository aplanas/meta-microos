SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.2"

RPM_NAME = "python311-opencensus-0.11.2-1.1.noarch.rpm"
RPM_HASH = "91d1e9b903538ce817922fd8f73100002734caf671a6ea76747c3c1ab11f618f569676d1df109c07f785107edfe2321d430cdaa6e912afd56a88ae3f56fd1bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus \
python3.11dist-opencensus \
python311-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-opencensus-context"

inherit rpm
