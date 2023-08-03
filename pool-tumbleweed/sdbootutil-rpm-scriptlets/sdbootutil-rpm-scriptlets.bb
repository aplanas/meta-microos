SUMMARY = "dummy scriptlets for the kernel"
DESCRIPTION = "Empty scriptlets to satisfy kernel dependencies"
LICENSE = "MIT"

PV = "1+git20230727.a0e666f"

RPM_NAME = "sdbootutil-rpm-scriptlets-1+git20230727.a0e666f-1.1.aarch64.rpm"
RPM_HASH = "db0941b8ff4c40fad7380db844de12436351b3afb1c7c8bae09326bb4f859fd3f210ec5d88db172bb497cee42ca976e27a0493f67b3e44c56dbe971d3a226cf0"

RPROVIDES:${PN} += "sdbootutil-rpm-scriptlets \
suse-kernel-rpm-scriptlets"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
