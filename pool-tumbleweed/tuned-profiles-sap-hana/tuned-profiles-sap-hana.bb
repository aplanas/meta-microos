SUMMARY = "Additional tuned profile(s) targeted to SAP HANA loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to SAP HANA loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-sap-hana-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "d78eee0f9b9017967326a61d4894e9915f8d6fdf935ab9a351de82235f829260554785c3ba4eb589c69981cf5bb8ed8b698d1e17b26c7408b19eae5c9068d907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-sap-hana"
RDEPENDS:${PN} += "tuned"

inherit rpm
