SUMMARY = "Info Files for XEmacs"
DESCRIPTION = "This package contains all info files for XEmacs. All these files can be \
read online with XEmacs and describe XEmacs and some of its modes."
LICENSE = "GPL-3.0-or-later"

PV = "21.5.34"

RPM_NAME = "xemacs-info-21.5.34-22.5.noarch.rpm"
RPM_HASH = "5cd426622f3df683a50a74e0f25411f34b6e6111d8edc2725cb3c033947df8b7a10ea3eb0e775b8de6aaf0dad6c527fee29c8ae0a76b71d9900a368e2e5e8c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-info"

RDEPENDS:${PN} += "xemacs-packages-info"

inherit rpm
