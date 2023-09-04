SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.52.noarch.rpm"
RPM_HASH = "caf3be37096caa3277e9f9740256a197a73b40e2dc40bf44fe737a96c2400463384267f4dfb23d0d27b5665f36c32cc59abf75a05be4716c3d9a29c8c7b305ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
