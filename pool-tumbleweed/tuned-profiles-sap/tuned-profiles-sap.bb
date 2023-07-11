SUMMARY = "Additional tuned profile(s) targeted to SAP NetWeaver loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to SAP NetWeaver loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-sap-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "d9d10a0986ebcd10e2210ade82cb82ad751879c16715262cf34eae43b016740db71cbb84d1f9ef5e75552454a70703d6061f84a44deeda82af410f38efa4dcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-sap"

RDEPENDS:${PN} += "tuned"

inherit rpm
