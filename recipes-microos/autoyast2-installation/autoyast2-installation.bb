SUMMARY = "YaST2 - Auto Installation Modules"
DESCRIPTION = "This package performs auto-installation relying on a control file \
generated with the autoyast2 package."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "autoyast2-installation-4.6.2-1.1.noarch.rpm"
RPM_HASH = "bf56b0e64c70a1b894ea53ee554657c1eff2a3598351bab63a17dd7e074507f9fda09ba0eb39de51be6cf43ea6a0b65a5b1f9f330a3872019a1881b17b0c9512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast2-installation yast2-trans-autoinst"
RDEPENDS:${PN} += "/bin/sh yast2 yast2-bootloader yast2-core yast2-country yast2-ncurses yast2-ntp-client yast2-packager yast2-pkg-bindings yast2-ruby-bindings yast2-services-manager yast2-slp yast2-transfer yast2-update yast2-xml"

inherit rpm
