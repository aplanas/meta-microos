SUMMARY = "A policy management tool for interacting with Gatekeeper"
DESCRIPTION = "Konstraint is a CLI tool to assist with the creation and management of templates and constraints when using Gatekeeper."
LICENSE = "Apache-2.0"

PV = "0.31.0"

RPM_NAME = "konstraint-0.31.0-1.1.aarch64.rpm"
RPM_HASH = "22f139e1e38d450c509c2480603f722c5b7cf008c3f447e06d9df84163be30829e13e7ba705fb8683aed97f3aa35e32a4cdc3eb15a9606952fdaaf8e341091af"

RPROVIDES:${PN} += "konstraint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
