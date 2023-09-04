SUMMARY = "dummy scriptlets for the kernel"
DESCRIPTION = "Empty scriptlets to satisfy kernel dependencies"
LICENSE = "MIT"

PV = "1+git20230814.38973c7"

RPM_NAME = "sdbootutil-rpm-scriptlets-1+git20230814.38973c7-1.1.aarch64.rpm"
RPM_HASH = "ffd589e4bd4dddb8b413a7b7f926365efd87b4f1f7e779b1ff77e1d070b6b9c49f89db129374d459e9ce9762d262f4faaa7e756dce94361c60948f9d3472069c"

RPROVIDES:${PN} += "sdbootutil-rpm-scriptlets \
suse-kernel-rpm-scriptlets"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
