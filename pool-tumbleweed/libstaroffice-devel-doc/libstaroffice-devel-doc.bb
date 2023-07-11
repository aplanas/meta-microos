SUMMARY = "Documentation for the libstaroffice API"
DESCRIPTION = "This package contains documentation for the libstaroffice API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-devel-doc-0.0.7-3.10.noarch.rpm"
RPM_HASH = "653acd77edb037e4705022ab3bdb2078eb3944218677999361984b01e6d8ecac19fe06256a2a7fbf8d75fb1f59ce587470e838d366bcc87dbe10640f3df4d4be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstaroffice-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
