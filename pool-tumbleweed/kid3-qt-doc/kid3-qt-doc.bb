SUMMARY = "Documentation for kid3-qt"
DESCRIPTION = "This package provides documentation and help files for kid3-qt."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-qt-doc-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "b9bf4f4101f3c1629fec7cec8e513a7a667635815b7b70565647ed5ea51ec99c384906d500cddbb531aa15f23e0140df477a118e988cd3f4e3bd75f5ad3a2a08"

RPROVIDES:${PN} += "kid3-qt-doc \
kid3-qt-doc(aarch-64)"

RDEPENDS:${PN} += "kid3-qt"

inherit rpm
