SUMMARY = "Erlang Java Interface"
DESCRIPTION = "JInterface module for accessing erlang from Java"
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-jinterface-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "fcc3f1b74eab8ff8648e6cbbe3fea5b6c9544a4c45a8fad8bd9f593a574b8e348d6e7ae2b3e73abf7d4184cc85eb0b82763821e24138a9e31151f27e868ecb98"

RPROVIDES:${PN} += "erlang-jinterface erlang-jinterface(aarch-64)"
RDEPENDS:${PN} += "erlang java"

inherit rpm
