SUMMARY = "An event tracer for Erlang programs"
DESCRIPTION = "An event tracer for Erlang programs."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-et-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "557aa7d242ac2b8a828e994e36dc85626aab1785a595af4fc8396de7e32ec8a140de93ba8899874aa0bee0184e4c5f3d1ea6d1c62205a3513ce2a5e640b78efe"

RPROVIDES:${PN} += "erlang-et"

RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
