SUMMARY = "Tool to convert json to yaml"
DESCRIPTION = "This is a small tool to convert json to yaml reading from STDIN and writing to STDOUT."
LICENSE = "MIT"

PV = "0.0+git20191212.bf2969b"

RPM_NAME = "gojsontoyaml-0.0+git20191212.bf2969b-1.17.aarch64.rpm"
RPM_HASH = "dcf194e1b8b26212944b64952e4b120efe972a46f62a1f5bf6049cefd78f8f9d37003e28db71685c951c8e8cc201ca38126cc3f8e9105d69ceb7a9ebd8e901eb"

RPROVIDES:${PN} += "gojsontoyaml \
gojsontoyaml(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
