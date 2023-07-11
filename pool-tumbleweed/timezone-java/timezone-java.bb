SUMMARY = "Time Zone Descriptions"
DESCRIPTION = "These are configuration files that describe available time zones - this \
package is intended for Java Virtual Machine based on OpenJDK."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2023c"

RPM_NAME = "timezone-java-2023c-1.2.noarch.rpm"
RPM_HASH = "8cb68fe53ffb6346bac380024ff39a406e1e4212f9019183728008ccd2e5112284a57ecbea7941e62bc97a5cc78f2ef72cfecdd797fc8261bcbae84722407a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timezone-java \
tzdata-java \
tzdata-java8"

RDEPENDS:${PN} += "coreutils \
filesystem"

inherit rpm
