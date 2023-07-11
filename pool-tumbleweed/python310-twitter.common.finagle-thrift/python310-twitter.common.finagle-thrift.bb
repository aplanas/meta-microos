SUMMARY = "Thrift stubs for zipkin RPC tracing support in finagle"
DESCRIPTION = "twitter.common.finagle-thrift is a Python library with Thrift stubs for zipkin \
RPC tracing support in finagle. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.9"

RPM_NAME = "python310-twitter.common.finagle-thrift-0.3.9-2.14.aarch64.rpm"
RPM_HASH = "5df68e63633d687488ce549d2aef112775b3e69b293ff368cc3d6008ef37b87a3b99e9e8e8e8cabf15720c29919c42ad6e752a3078dc33c8ff6bbec6a1e0ac94"

RPROVIDES:${PN} += "python3.10dist-twitter.common.finagle-thrift \
python310-twitter.common.finagle-thrift \
python3dist-twitter.common.finagle-thrift"

RDEPENDS:${PN} += "python-abi"

inherit rpm
