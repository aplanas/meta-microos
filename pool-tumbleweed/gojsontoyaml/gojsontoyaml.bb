SUMMARY = "Tool to convert json to yaml"
DESCRIPTION = "This is a small tool to convert json to yaml reading from STDIN and writing to STDOUT."
LICENSE = "MIT"

PV = "0.0+git20191212.bf2969b"

RPM_NAME = "gojsontoyaml-0.0+git20191212.bf2969b-1.18.aarch64.rpm"
RPM_HASH = "13a6c84fcc5ea4513abc45b882e4d7959f245477f781729ad925899245f4e64a00cc06047926e57a49057952428a0cf3ae0ab4f31cee2f9f8b737b2ac4397610"

RPROVIDES:${PN} += "gojsontoyaml"

RDEPENDS:${PN} += ""

inherit rpm
