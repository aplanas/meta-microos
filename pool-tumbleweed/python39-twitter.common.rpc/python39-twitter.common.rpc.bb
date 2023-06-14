SUMMARY = "Thrift helpers including finagle and SSL transports"
DESCRIPTION = "twitter.common.rpc is a Python library with Thrift helpers including finagle \
and SSL transport. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python39-twitter.common.rpc-0.3.11-1.15.aarch64.rpm"
RPM_HASH = "f79746dc4eb69283ad7481264473a0bc8cfe7b89d93bd38b2d403392ce6097aee4275bc94d2858ef0ada586cf0b772668b48f41037fcf28e85b905d0d47e2f0b"

RPROVIDES:${PN} += "python3.9dist-twitter.common.rpc \
python39-twitter.common.rpc \
python3dist-twitter.common.rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
