SUMMARY = "HTML documentation and examples for gettext-runtime"
DESCRIPTION = "This subpackage contains the HTML version of the gettext documentation \
as well as project examples."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-runtime-mini-tools-doc-0.21.1-2.1.noarch.rpm"
RPM_HASH = "66e81740d0cf477f9b238de94a5de8f6d64cd3f0ee8d7eff5747786495676a6e753a20190c56c8508001bd3858d4648cc72c5e1ead660e38e42d35bb2f3e2707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-runtime-mini-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
