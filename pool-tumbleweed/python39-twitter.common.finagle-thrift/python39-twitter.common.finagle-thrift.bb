SUMMARY = "Thrift stubs for zipkin RPC tracing support in finagle"
DESCRIPTION = "twitter.common.finagle-thrift is a Python library with Thrift stubs for zipkin \
RPC tracing support in finagle. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.9"

RPM_NAME = "python39-twitter.common.finagle-thrift-0.3.9-2.14.aarch64.rpm"
RPM_HASH = "a6b9738e42f54981e9c1796727f3fd453a7ea8e4005b764fd59990fa7907eb402b0d84b155593b185881adcd1b77ff45f6837d4a93b8f04641d2cc4449e115fe"

RPROVIDES:${PN} += "python3.9dist-twitter.common.finagle-thrift \
python39-twitter.common.finagle-thrift \
python3dist-twitter.common.finagle-thrift"

RDEPENDS:${PN} += "python-abi"

inherit rpm
