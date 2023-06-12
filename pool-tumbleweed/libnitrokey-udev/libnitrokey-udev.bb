SUMMARY = "udev rules for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the udev rules."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey-udev-3.8-1.3.noarch.rpm"
RPM_HASH = "2533d13ddecefb0ae970598f4fe706dc449241b02cd05f7acc45f0ea769b63718f7a4c7717b917c065c771f55e4d118383f873f426601c3fab7cdcb43b36f26e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnitrokey-udev"
RDEPENDS:${PN} += ""

inherit rpm
