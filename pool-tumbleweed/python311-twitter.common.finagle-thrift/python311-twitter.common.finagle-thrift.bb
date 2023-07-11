SUMMARY = "Thrift stubs for zipkin RPC tracing support in finagle"
DESCRIPTION = "twitter.common.finagle-thrift is a Python library with Thrift stubs for zipkin \
RPC tracing support in finagle. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.9"

RPM_NAME = "python311-twitter.common.finagle-thrift-0.3.9-2.14.aarch64.rpm"
RPM_HASH = "ec81ed910dcb92be3de70f143e92da49045c416e28c954e9a66be4180849bf0a9e1a33a59c43356be85d92b33450c9d19dd05187f08133623391b70e4846f994"

RPROVIDES:${PN} += "python3-twitter.common.finagle-thrift \
python3.11dist-twitter.common.finagle-thrift \
python311-twitter.common.finagle-thrift \
python3dist-twitter.common.finagle-thrift"

RDEPENDS:${PN} += "python-abi"

inherit rpm
