SUMMARY = "Thrift helpers including finagle and SSL transports"
DESCRIPTION = "twitter.common.rpc is a Python library with Thrift helpers including finagle \
and SSL transport. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python310-twitter.common.rpc-0.3.11-1.17.aarch64.rpm"
RPM_HASH = "1bb3e7dd2cab2143ebfaeeec338e0bb60d5bd8b702f65b664d859ff2f40aa588f337fc6741b2ca02bc1b8a2e3e24a73d40b0d10bf87280e2e958d7d8add97f3c"

RPROVIDES:${PN} += "python3.10dist-twitter.common.rpc \
python310-twitter.common.rpc \
python3dist-twitter.common.rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
