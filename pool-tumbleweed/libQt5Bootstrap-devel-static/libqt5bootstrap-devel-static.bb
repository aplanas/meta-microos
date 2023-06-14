SUMMARY = "Qt Bootstrap module"
DESCRIPTION = "Qt Bootstrap module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Bootstrap-devel-static-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "1be074f25cb2e21d57e508148c8eb9c046f121deb6d71962c52ad503053d9cbbc48eb34b3b57b30f19616725675b21d8c81cc71213c11fd3cd2e08d343263d91"

RPROVIDES:${PN} += "libQt5Bootstrap-devel-static"

RDEPENDS:${PN} += "libqt5-qtbase-common-devel"

inherit rpm
