SUMMARY = "Property editing framework with editor widget"
DESCRIPTION = "A property editing framework with editor widget similar to what is known from Qt Designer"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kproperty-3.2.0-2.21.aarch64.rpm"
RPM_HASH = "5822886085fb4a586c2cf81bbe71a86b128a98846e9dc32b4247a339e49ed43eda6ef111c79478cc1a1b80c581e1c999f781ecac94f9dde2458b319a1c0aee04"

RPROVIDES:${PN} += "kproperty \
kproperty(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
