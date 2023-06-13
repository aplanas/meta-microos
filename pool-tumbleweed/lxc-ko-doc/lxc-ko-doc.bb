SUMMARY = "Korean documentation for lxc"
DESCRIPTION = "Korean language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-ko-doc-5.0.2-1.1.noarch.rpm"
RPM_HASH = "77ec020359883b504452ff06f22238622cf866e6e75400dcd60d60221f359c205fa2032851d936580de543a12a1fe835ce30d5f35f6eb35d68f0d5e57e8294a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ko-doc"

RDEPENDS:${PN} += "lxc"

inherit rpm
