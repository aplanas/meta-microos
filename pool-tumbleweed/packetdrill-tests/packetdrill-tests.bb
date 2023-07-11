SUMMARY = "Sample test scripts for packetdrill"
DESCRIPTION = "Collection of sample test scripts from Google for packetdrill utility."
LICENSE = "GPL-2.0-only"

PV = "2.0+git.20230521"

RPM_NAME = "packetdrill-tests-2.0+git.20230521-1.1.noarch.rpm"
RPM_HASH = "440528958632f59f3b0b6cd1068614b2675371f17c81ad8b8f48ffcee06038506c08a8499369a5f9f9e7f11a4debd03f4364b3448ed92145008b42a0d1501c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "packetdrill-tests"

RDEPENDS:${PN} += ""

inherit rpm
