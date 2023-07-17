SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9"

RPM_NAME = "lttng-modules-2.13.9-1.8.aarch64.rpm"
RPM_HASH = "8ed9e6876546cc0009da3409994dc6fdce344baa15a7c8fb643a22ff8c58f2a5d4975075fdcfcadbc01e9b532824c436dab8f0ed51039488674f741314451b11"

RPROVIDES:${PN} += "lttng-modules"

RDEPENDS:${PN} += ""

inherit rpm
