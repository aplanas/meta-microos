SUMMARY = "Korean documentation for lxc"
DESCRIPTION = "Korean language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-ko-doc-5.0.2-1.2.noarch.rpm"
RPM_HASH = "ab824940cbe7b57a8942ebca150c3d32add48f5b14a451e772acff3da7dd67ef4b80e24394ffd40450282b3daa37220251b44568fc40e65464c56b56a0510fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ko-doc"

RDEPENDS:${PN} += "lxc"

inherit rpm
