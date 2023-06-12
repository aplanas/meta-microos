SUMMARY = "Udev rules for Solo and Solo Tap security keys"
DESCRIPTION = "This package contains the udev rule file for the Solo and Solo Tap security keys. \
These are required if local non-root users are supposed to be able to use the keys."
LICENSE = "Apache-2.0 | MIT"

PV = "4.1.2"

RPM_NAME = "solo-udev-4.1.2-1.6.noarch.rpm"
RPM_HASH = "f5330a66d31c18f841e3aa33b036b55d08ebb91d63ecde4894f0a5ef9c534ff66fa629f8a86d51913063853553f533cf174dfddf74ec344863540168bbc06e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solo-udev"
RDEPENDS:${PN} += "udev"

inherit rpm
