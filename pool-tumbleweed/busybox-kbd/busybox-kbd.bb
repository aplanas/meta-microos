SUMMARY = "Busybox applets replacing kbd"
DESCRIPTION = "This package contains the symlinks to replace kbd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kbd-1.36.1-30.1.noarch.rpm"
RPM_HASH = "c3ae721ab6dcaa6d61235df18dc0f53d10f91b892d1d46af84f51bbfccb1ce399ee74ba200584f4ad40f9d99241d5b0d67614506ea3c73eac98431adaa8d6978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-kbd"

RDEPENDS:${PN} += "busybox"

inherit rpm
