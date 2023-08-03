SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-lt-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "453c80c1d31350d08a9752747bb6a477ad7e5d6bfa34cd13819622831ca7837b994a40c58dba21708a2a3b7c4b76ce4914f04c7033fa39e4fe1e465c048c4a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lt \
yast2-trans-lt"

RDEPENDS:${PN} += ""

inherit rpm
