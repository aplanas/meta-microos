SUMMARY = "AppArmor"
DESCRIPTION = "The 32bit pattern complementing apparmor."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-apparmor-32bit-20200505-42.1.aarch64.rpm"
RPM_HASH = "88f17e7ff094e2dbb5a805843042a3df9df83d2ed2ad2e21bc386d8664a60a681e455929db313adb468fac6c38b7c339fc7e114eef5a6db63ea3dbec0a4601ee"

RPROVIDES:${PN} += "pattern- \
patterns-base-apparmor-32bit"

RDEPENDS:${PN} += ""

inherit rpm
