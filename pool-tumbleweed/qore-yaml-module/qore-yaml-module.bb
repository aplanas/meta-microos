SUMMARY = "YAML module for Qore"
DESCRIPTION = "This package contains the yaml module for the Qore Programming Language. \
 \
YAML is a flexible and concise human-readable data serialization format."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "0.7.3"

RPM_NAME = "qore-yaml-module-0.7.3-2.1.aarch64.rpm"
RPM_HASH = "a4c4063696f84ceef3fd7fcafcae4ffa01920edaa07b03f84cd841965144e90c54a663c5adbee3e82068a35033a0c1afdafb7a37fd7f74a9980260727fed5cbc"

RPROVIDES:${PN} += "qore-yaml-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-0.so.2 \
qore-module-abi"

inherit rpm
