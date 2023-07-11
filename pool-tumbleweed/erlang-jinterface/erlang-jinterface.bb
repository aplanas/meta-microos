SUMMARY = "Erlang Java Interface"
DESCRIPTION = "JInterface module for accessing erlang from Java"
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-jinterface-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "eb5455c59dfcc0ebfb4c918a6603a9f7516c5de0d519c063f50b77c2ff1c0ab016bff8e95389c11bc8ed6dd716704e9c23dbf932f1bffec29f2226175fe0117d"

RPROVIDES:${PN} += "erlang-jinterface"

RDEPENDS:${PN} += "erlang \
java"

inherit rpm
