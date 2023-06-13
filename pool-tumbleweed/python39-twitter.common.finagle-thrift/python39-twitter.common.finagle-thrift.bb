SUMMARY = "Thrift stubs for zipkin RPC tracing support in finagle"
DESCRIPTION = "twitter.common.finagle-thrift is a Python library with Thrift stubs for zipkin \
RPC tracing support in finagle. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.9"

RPM_NAME = "python39-twitter.common.finagle-thrift-0.3.9-2.13.aarch64.rpm"
RPM_HASH = "742cee06388ae491dd51fca3cf25d623b21cef270c0f690e5c0cc23200a5cf246469e1232f7c0b1735dab00f12d24280d68c18af83b979f12ad236c82bd4e8e2"

RPROVIDES:${PN} += "python3.9dist(twitter.common.finagle-thrift) \
python39-twitter.common.finagle-thrift \
python39-twitter.common.finagle-thrift(aarch-64) \
python3dist(twitter.common.finagle-thrift)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
