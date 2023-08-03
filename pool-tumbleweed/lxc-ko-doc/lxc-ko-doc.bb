SUMMARY = "Korean documentation for lxc"
DESCRIPTION = "Korean language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "lxc-ko-doc-5.0.3-1.1.noarch.rpm"
RPM_HASH = "3e12886982b873924e970e47110bc3d42e4a13216c4188a0e6d38da5aaa470632e70fa224ca843e50d41d68c2eb4350d43e19a2b34205e625bdf43cd2d432921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ko-doc"

RDEPENDS:${PN} += "lxc"

inherit rpm
