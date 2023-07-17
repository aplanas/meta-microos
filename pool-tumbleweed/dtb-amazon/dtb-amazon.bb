SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-amazon-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "b0aa4cb7ecf29a99877225a889560ac6b02af2f97f1af695754febab79feda77edc4ab5c1a68ddb25d5ff79785bc977b5986ce36504db32d6cee7ba7a085e1e5"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
