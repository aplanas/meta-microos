SUMMARY = "API documentation files for xsd"
DESCRIPTION = "This package contains API documentation for xsd."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "4.1.0"

RPM_NAME = "xsd-doc-4.1.0-1.15.aarch64.rpm"
RPM_HASH = "598a9914f64ccf5e525bd30572e205872a1f793c458c68443ed698cd4c05ce363d614dc993b85a4de0e9fab3181457ad0402e132051412e6a94a93b0f38bfe03"

RPROVIDES:${PN} += "xsd-doc"

RDEPENDS:${PN} += "xsd"

inherit rpm
