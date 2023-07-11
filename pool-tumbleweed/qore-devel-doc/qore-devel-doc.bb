SUMMARY = "C++ API documentation for the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-devel-doc-1.13.0-1.6.noarch.rpm"
RPM_HASH = "704386b7a05d8ac86813eceef013e036fc8ade1f77cbf56dc57c309552e6100d6034f9124b2df6da8bb53086684b56f16aa8a9266fa61f0a3d49f6b92b0125e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-devel-doc"

RDEPENDS:${PN} += "libqore12"

inherit rpm
