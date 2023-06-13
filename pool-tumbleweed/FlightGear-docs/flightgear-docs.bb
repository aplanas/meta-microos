SUMMARY = "FlightGear Documentation"
DESCRIPTION = "This package contains pdf, text and html documentation for the \
FlightGear flight simulator package."
LICENSE = "GPL-2.0-only"

PV = "2020.3.18"

RPM_NAME = "FlightGear-docs-2020.3.18-1.1.noarch.rpm"
RPM_HASH = "1d1246d86ac146c92129b50012ae37fe964705b8b2e42f0c3b92cd4b84d8a45f81978dd0c1f54b750692d2360a5f5505b83c41051adca8b5f03dec6b5aa3e78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "FlightGear-docs"

RDEPENDS:${PN} += "FlightGear-data"

inherit rpm
