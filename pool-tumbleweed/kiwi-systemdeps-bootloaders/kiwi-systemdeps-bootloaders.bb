SUMMARY = "KIWI - host requirements for configuring bootloaders"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host for configuring bootloaders on images."
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "kiwi-systemdeps-bootloaders-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "06a3f210f40777bbca621c18c84ce15965797d39b761393818f5eff84ac14cf4f2ad71d6a9e9b3edc476557e2b9371f0b84a81b944ed704656ffba2536aa847e"

RPROVIDES:${PN} += "kiwi-systemdeps-bootloaders"

RDEPENDS:${PN} += "grub2 \
kiwi-systemdeps-core \
u-boot-tools"

inherit rpm
