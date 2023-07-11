SUMMARY = "Additional tuned profile(s) targeted to SAP HANA loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to SAP HANA loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-sap-hana-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "c8f2a0bb1c54b1e6aad5e98692a5db7af486f58dc9036c8a299a8cf7f3f75c91e437da7e62e938abb68fcc05447c92765f046a51fd776d37b7c471feac168457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-sap-hana"

RDEPENDS:${PN} += "tuned"

inherit rpm
