SUMMARY = "Thrift helpers including finagle and SSL transports"
DESCRIPTION = "twitter.common.rpc is a Python library with Thrift helpers including finagle \
and SSL transport. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python39-twitter.common.rpc-0.3.11-1.17.aarch64.rpm"
RPM_HASH = "65c885231534524afa7d072323b73250e99415325ddfdc2b2a05a8bc4e70190f7fe87591790f4b4d30a192cea132c119175fdca95368f9a6594ac605ecabb3ee"

RPROVIDES:${PN} += "python3.9dist-twitter.common.rpc \
python39-twitter.common.rpc \
python3dist-twitter.common.rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
