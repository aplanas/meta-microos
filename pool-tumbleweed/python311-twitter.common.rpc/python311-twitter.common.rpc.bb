SUMMARY = "Thrift helpers including finagle and SSL transports"
DESCRIPTION = "twitter.common.rpc is a Python library with Thrift helpers including finagle \
and SSL transport. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python311-twitter.common.rpc-0.3.11-1.15.aarch64.rpm"
RPM_HASH = "f1572163c5e1dbe9ea258522c53a558c44c6025cad6f88065395d41420e86ca13930beedb15b351520c1768ee475fe67366704f046686d68a5806d69d6ef5a1f"

RPROVIDES:${PN} += "python3.11dist(twitter.common.rpc) \
python311-twitter.common.rpc \
python311-twitter.common.rpc(aarch-64) \
python3dist(twitter.common.rpc)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
