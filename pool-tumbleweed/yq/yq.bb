SUMMARY = "A portable command-line YAML processor"
DESCRIPTION = "A lightweight and portable command-line YAML processor. yq uses jq like syntax \
but works with yaml files as well as json. It doesn't yet support everything \
jq does - but it does support the most common operations and functions, and more \
is being added continuously."
LICENSE = "MIT"

PV = "4.34.2"

RPM_NAME = "yq-4.34.2-1.1.aarch64.rpm"
RPM_HASH = "8720e961d5a798a00df1b89e568c2ca83135c5e70d02c2b67499169f5bfd19c3f1f770dece13e62532149aad15c69b3ab5b63d89cec0fc9d55a2b92212fbb647"

RPROVIDES:${PN} += "yq"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
