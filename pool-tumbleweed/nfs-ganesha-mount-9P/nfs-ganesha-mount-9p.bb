SUMMARY = "a 9p mount helper"
DESCRIPTION = "This package contains the mount.9P script that clients can use \
to simplify mounting to NFS-Ganesha. This is a 9p mount helper."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-mount-9P-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "5c30fb2c402d8204c19ce1bc2ddb320ec8f4d2f4fda6084f395adc52ebb2e47808c7b50a42a7094793e593fccd39cdc117c345a99788656b016665f3ebca3e17"

RPROVIDES:${PN} += "nfs-ganesha-mount-9P"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
