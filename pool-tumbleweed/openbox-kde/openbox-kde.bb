SUMMARY = "Openbox KDE integration"
DESCRIPTION = "This package provides openbox KDE integration and tools"
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-kde-3.6.1-4.1.aarch64.rpm"
RPM_HASH = "4c201a668cad9dd0f28a23caf6af7a64a577c64455c64d9d47016e2af056c55963531f6faca5b1524a283139c3eee08d2c113095bd6849957e364b431d615686"

RPROVIDES:${PN} += "openbox-kde \
openbox-kde(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
openbox"

inherit rpm
