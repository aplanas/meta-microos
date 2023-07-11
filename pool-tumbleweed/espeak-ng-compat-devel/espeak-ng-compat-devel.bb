SUMMARY = "Development files for espeak-ng compatible with espeak"
DESCRIPTION = "This package contains development files for espeak-ng \
compatible with the original espeak."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-compat-devel-1.51-1.9.aarch64.rpm"
RPM_HASH = "da4519ce276713028dd82fae2065e28a38b8aab205c01c2cd7e22ed02c99c49336ae03599a60dc4b6530cb0df12f1855db33b0d021861445629805c23afe943f"

RPROVIDES:${PN} += "espeak-ng-compat-devel"

RDEPENDS:${PN} += "espeak-ng-compat \
espeak-ng-devel \
libespeak-ng1"

inherit rpm
