SUMMARY = "An event tracer for Erlang programs"
DESCRIPTION = "An event tracer for Erlang programs."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-et-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "36343afa22b116255da6c8a3c86beb12b85a43883c56ce5d74e0c681ffe590cbfbad20993608206b64360e586431ac6db770de60f447955504cb05fdc70332a1"

RPROVIDES:${PN} += "erlang-et"

RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
