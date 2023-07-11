SUMMARY = "Development libraries for multipath-tools"
DESCRIPTION = "This package contains the development libraries for multipath-tools \
and libmpathpersist."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "multipath-tools-devel-0.9.5+68+suse.d1b6a1c-1.2.aarch64.rpm"
RPM_HASH = "8c3e5c490534c63d6ddd472b19ff559adc2b03272f5f0cb892b239899474c87cbf22a5116238f657a71217935de6a5eb4b82469a3aae707ec2ef85c1dc3bdac7"

RPROVIDES:${PN} += "multipath-tools-devel"

RDEPENDS:${PN} += "libmpath0"

inherit rpm
