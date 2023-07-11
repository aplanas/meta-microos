SUMMARY = "Documentation for power-profiles-daemon"
DESCRIPTION = "This package provides documentation for power-profiles-daemon."
LICENSE = "GPL-3.0-or-later"

PV = "0.13"

RPM_NAME = "power-profiles-daemon-doc-0.13-1.2.noarch.rpm"
RPM_HASH = "d4bb95751cda33bb4cff116885016332e4ed2f3224fec2556d18f0a3a2cf94b62bad7eb3709e0ebaf584b737ac31dfc7632a3d79d9e3c366f9993e2ec605eb0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "power-profiles-daemon-doc"

RDEPENDS:${PN} += ""

inherit rpm
