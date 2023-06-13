SUMMARY = "Core libraries for Shorewall"
DESCRIPTION = "This package contains the core libraries for Shorewall."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-core-5.2.8-4.2.noarch.rpm"
RPM_HASH = "2030f285314414777550a97bdfea4870b96156904476a145655d3dea0fb51c3513c472d9d4c02da0bba57a6c585e8359df4d2086da53b8d6781afc2bf8fe8516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-core"

RDEPENDS:${PN} += "/bin/sh \
iptables \
perl-base"

inherit rpm
