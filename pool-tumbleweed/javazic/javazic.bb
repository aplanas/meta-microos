SUMMARY = "A time zone compiler for Java"
DESCRIPTION = "This is a time zone compiler for opensource Java Virtual Machine \
derived from openjdk6 source code."
LICENSE = "GPL-2.0-with-classpath-exception"

PV = "1.7.0"

RPM_NAME = "javazic-1.7.0-1.7.noarch.rpm"
RPM_HASH = "8b05de4a16401342aa96f094070a92eb26c833bfaf3e4786c2e87896f67e456a264113c2d5b16b85833c853ee3ff90f2ccadd67e413da995224ff65bc3382924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javazic"

RDEPENDS:${PN} += ""

inherit rpm
