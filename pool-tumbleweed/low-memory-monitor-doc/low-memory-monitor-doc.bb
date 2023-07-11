SUMMARY = "Documentation for low-memory-monitor"
DESCRIPTION = "This package provides documentation for low-memory-monitor."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "low-memory-monitor-doc-2.1-3.9.aarch64.rpm"
RPM_HASH = "def33a3a02ace2b3ef0d138178de63007bb22a336ad83a62450028240d3ff10a7fcfc8916a11e616bf5f7cf21be576eab48b0a9e015030c8b568bbd458a6e265"

RPROVIDES:${PN} += "low-memory-monitor-doc"

RDEPENDS:${PN} += ""

inherit rpm
