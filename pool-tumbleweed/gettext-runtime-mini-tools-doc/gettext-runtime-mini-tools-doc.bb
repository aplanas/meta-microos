SUMMARY = "HTML documentation and examples for gettext-runtime"
DESCRIPTION = "This subpackage contains the HTML version of the gettext documentation \
as well as project examples."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-runtime-mini-tools-doc-0.21.1-2.2.noarch.rpm"
RPM_HASH = "083d4d7d5a338890cd36d61847ae8740d479b19fa2566053d7be5ca349e950014c78a68b92ca604f4db98a94decb10183bc649c01b437d11705ffa73f17b5baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-runtime-mini-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
