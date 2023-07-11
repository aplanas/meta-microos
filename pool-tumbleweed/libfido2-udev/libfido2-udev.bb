SUMMARY = "Udev rules for libfido2"
DESCRIPTION = "This package contains the udev rules for FIDO2 compatible devices."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-udev-1.13.0-1.3.noarch.rpm"
RPM_HASH = "ca60c60029cfb905cad76fdb7e7cd60e00944c3545e8f49732efed407eb38e93d0467721c27695a23b5121652dbf0d7c61f08cd3de854b3a6afb51d4c156f4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfido2-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
