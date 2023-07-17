SUMMARY = "Documentation for qt6-3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-3d-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "46698bc0559c7efd14c11582f0acdffc42514151c11c23be575bb90f7a10746f36f708edc80375b9237eb19ec18678e2acd7ce7c904d2c892a745deaab3f5f04"

RPROVIDES:${PN} += "qt6-3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
