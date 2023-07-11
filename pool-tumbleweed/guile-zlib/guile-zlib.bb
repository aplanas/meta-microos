SUMMARY = "Guile bindings to zlib"
DESCRIPTION = "This package provides Guile bindings to zlib, a data lossless date-coompression \
library."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0"

RPM_NAME = "guile-zlib-0.1.0-1.9.aarch64.rpm"
RPM_HASH = "ee6eb5777d96ec2723e3e36b905cc34dc6083db24eadd03b53f58728bf115ae7a1ac50e7d2e07d54b19f7c705436764b49899b261fcd0d037ec207499d1ffa55"

RPROVIDES:${PN} += "guile-zlib"

RDEPENDS:${PN} += "guile \
zlib-devel"

inherit rpm
