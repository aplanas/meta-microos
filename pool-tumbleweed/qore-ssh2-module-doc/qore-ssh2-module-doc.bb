SUMMARY = "Documentation and examples for the Qore SSH2 module"
DESCRIPTION = "SSH2 module for the Qore Programming Language. \
 \
This RPM provides API documentation, test and example programs"
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-ssh2-module-doc-1.4.1-1.10.aarch64.rpm"
RPM_HASH = "f10d0a887b6e6753c3f5608d4c70070ea91cda85e0b0a508d578c9293e47f775513d3a9032082c140e053e2981edb0f0f5d4bceea8e8774d8cf2d9291650a3ab"

RPROVIDES:${PN} += "qore-ssh2-module-doc"

RDEPENDS:${PN} += "qore-ssh2-module"

inherit rpm
