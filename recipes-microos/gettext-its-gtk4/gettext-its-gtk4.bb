SUMMARY = "International Tag Set for GTK+ 4"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 4"
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "gettext-its-gtk4-4.10.3-4.1.aarch64.rpm"
RPM_HASH = "156d06d77a1d6752df7bd4ee8feebd4e691470b3730dcdd96517aa3f47d4fe451852932053c4c5b8393698b6d26bd1f07cfd4a4e46c819cf8692fa16dab0d7ed"

RPROVIDES:${PN} += "gettext-its-gtk3 gettext-its-gtk4 gettext-its-gtk4(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
