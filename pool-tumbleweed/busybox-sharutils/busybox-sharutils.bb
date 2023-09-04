SUMMARY = "Busybox applets replacing sharutils"
DESCRIPTION = "This package contains the symlinks to replace sharutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sharutils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "59244a3d4414312a1e78f5d157c28da4160e92f3d9c8de3a155a57b5a18f52c4ec0d1adc3cb327a289008e27527f4362857238d7e2b23714c5d2f45f346a4f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sharutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
