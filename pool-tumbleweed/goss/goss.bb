SUMMARY = "Quick and Easy server testing/validation"
DESCRIPTION = "Goss is a YAML based serverspec alternative tool for validating a server’s configuration. It eases the process of writing tests by allowing the user to generate tests from the current system state. Once the test suite is written they can be executed, waited-on, or served as a health endpoint."
LICENSE = "Apache-2.0"

PV = "0.3.23"

RPM_NAME = "goss-0.3.23-1.1.aarch64.rpm"
RPM_HASH = "5d93475e9c29320871e4e13c7bd76128a5c5492ebc4e69909872ba64626ca987ffaa6aebf696ccd4f8957ba148f910d654e637f0ba773a94fd5dbc905165cd5d"

RPROVIDES:${PN} += "goss"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env"

inherit rpm
