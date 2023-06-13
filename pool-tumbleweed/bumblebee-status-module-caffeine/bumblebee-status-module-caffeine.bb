SUMMARY = "Widget for automatic screen locking"
DESCRIPTION = "Enable/disable automatic screen locking."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-caffeine-2.1.5-3.3.noarch.rpm"
RPM_HASH = "f2e942575f655341ac9b68cf9f52341f54b5c573b0e5703a65ce4ce1258ade4a6dcfe107d4b98cdb8d01f3d526c5efc2d62ef82702d06477b4f2606b849903bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-caffeine"

RDEPENDS:${PN} += "bumblebee-status \
libnotify-tools \
xdotool \
xprop"

inherit rpm
