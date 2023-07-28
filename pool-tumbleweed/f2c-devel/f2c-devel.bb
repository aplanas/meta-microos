SUMMARY = "Files for Developing with f2c"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "f2c-devel-20210928-2.1.aarch64.rpm"
RPM_HASH = "1d878968f59e96323bbeba96eb097fd3edcc12a754488237f3b610466ef0696c18723242154f39015ac01bedbdd460c2a31ffe9c02edafe486e51d7b4bb6bec0"

RPROVIDES:${PN} += "f2c-devel"

RDEPENDS:${PN} += "libf2c0"

inherit rpm
