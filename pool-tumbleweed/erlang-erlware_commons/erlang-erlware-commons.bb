SUMMARY = "A project focused on all aspects of reusable Erlang components"
DESCRIPTION = "Erlware Commons is an Erlware project focused on all aspects of reusable Erlang components."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "erlang-erlware_commons-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "68df0b248505cd1cb46c64aef73b246ef810dfb491d88ae526315e478ac79dde32d45f99583c098686f068f32ca69cd466e5b18314783619cdc27fd0869565d4"

RPROVIDES:${PN} += "erlang-erlware_commons \
erlang-erlware_commons(aarch-64)"

RDEPENDS:${PN} += "erlang \
erlang-cf"

inherit rpm
