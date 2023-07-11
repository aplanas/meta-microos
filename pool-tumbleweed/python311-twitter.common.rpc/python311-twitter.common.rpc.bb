SUMMARY = "Thrift helpers including finagle and SSL transports"
DESCRIPTION = "twitter.common.rpc is a Python library with Thrift helpers including finagle \
and SSL transport. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python311-twitter.common.rpc-0.3.11-1.17.aarch64.rpm"
RPM_HASH = "867971e6d16ed1558266eb81a1597995a1a9d69c28e4b2db79347a85653bae77cf986547cac2978bdc3f07ca01f32f4c3582e29c5009a505b0dab99ea27ef961"

RPROVIDES:${PN} += "python3-twitter.common.rpc \
python3.11dist-twitter.common.rpc \
python311-twitter.common.rpc \
python3dist-twitter.common.rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
