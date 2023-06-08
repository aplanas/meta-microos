SUMMARY = "YaST2 - Auto Installation Modules"
DESCRIPTION = "This package performs auto-installation relying on a control file \
generated with the autoyast2 package."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "autoyast2-installation-4.6.1-1.1.noarch.rpm"
RPM_HASH = "789eb514f5a92ffee55b9fffbd4e1a417829d4013141dce049c1e63955454f3d09b9e0d88de071228e9322d2ae523e3c1f717ccccb3f5fec20cca9a26d40992c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast2-installation yast2-trans-autoinst"
RDEPENDS:${PN} += "/bin/sh yast2 yast2-bootloader yast2-core yast2-country yast2-ncurses yast2-ntp-client yast2-packager yast2-pkg-bindings yast2-ruby-bindings yast2-services-manager yast2-slp yast2-transfer yast2-update yast2-xml"

inherit rpm
