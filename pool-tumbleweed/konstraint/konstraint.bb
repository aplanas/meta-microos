SUMMARY = "A policy management tool for interacting with Gatekeeper"
DESCRIPTION = "Konstraint is a CLI tool to assist with the creation and management of templates and constraints when using Gatekeeper."
LICENSE = "Apache-2.0"

PV = "0.30.0"

RPM_NAME = "konstraint-0.30.0-1.1.aarch64.rpm"
RPM_HASH = "dab33f8512bfd9f0f7ce7a9e0ee00bf42a2630300515ffecba08629fd50ed2d6463235368a86c374d2282b4500f4a39ace2c4a3fd4ee30c0c9c0ec26def2a378"

RPROVIDES:${PN} += "konstraint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
