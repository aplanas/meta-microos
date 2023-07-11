SUMMARY = "Documentation for quazip, a C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs. \
 \
This package contains documentation for quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "quazip-doc-1.4-2.4.noarch.rpm"
RPM_HASH = "0938f9628d70af389e1daeda4ab8e93892e12efc7f53019caa81122c93ea1dc392aa30462a28fc9aee2c102c8c90cb3964bbf3a586e2e97126bd2b20945f482f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libquazip-qt5-doc \
quazip-doc \
quazip-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
