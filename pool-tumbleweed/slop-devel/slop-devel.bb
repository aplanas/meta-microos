SUMMARY = "Development files for the slop library"
DESCRIPTION = "Header files for the slop library."
LICENSE = "GPL-3.0-or-later"

PV = "7.6"

RPM_NAME = "slop-devel-7.6-2.6.aarch64.rpm"
RPM_HASH = "d3e06507fda6e4f97c07c945d71a49a143d8175725b60392b7e200b8537d03c48c2643fb053045919ca0703352afc7605f4b63e20119dbd2b10fc12dddf1ec75"

RPROVIDES:${PN} += "slop-devel"

RDEPENDS:${PN} += "libslopy7-6"

inherit rpm
