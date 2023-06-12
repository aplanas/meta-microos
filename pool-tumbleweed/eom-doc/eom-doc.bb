SUMMARY = "Documentation how to Use eom"
DESCRIPTION = "This package contains the documentation for eom"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "eom-doc-1.26.1-1.1.noarch.rpm"
RPM_HASH = "2b42780ec12640ff759b97a9fc692454d054955f78b4725908fd2f5267ccdf87fadd0dad7726f0e6b25c7d74c7f6dda0506cb7d074fb0fea1a438063a81bb825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eom-doc"
RDEPENDS:${PN} += ""

inherit rpm
