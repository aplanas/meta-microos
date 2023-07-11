SUMMARY = "Property editing framework with editor widget"
DESCRIPTION = "A property editing framework with editor widget similar to what is known from Qt Designer"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kproperty-3.2.0-2.22.aarch64.rpm"
RPM_HASH = "fdc0b13b11284961f5d3222fed52b12a06230cd2b10d13f7673e0a280ff73b428a5c6c65f145449fda68ce42d88aaea3c2c6ad698afe30caf32bb6a48d45cea5"

RPROVIDES:${PN} += "kproperty"

RDEPENDS:${PN} += ""

inherit rpm
