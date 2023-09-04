SUMMARY = "Busybox applets replacing patch"
DESCRIPTION = "This package contains the symlinks to replace patch with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-patch-1.36.1-28.1.noarch.rpm"
RPM_HASH = "59380ece5c9a9a48c081de08a715ae227d96a6a4f7261ad64e6fa792eb1a53fca041e08d7a19be7b2830d6bb04567cf3329f72adc37ee5121952a85235775a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-patch"

RDEPENDS:${PN} += "busybox"

inherit rpm
