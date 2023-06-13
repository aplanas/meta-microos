SUMMARY = "Japanese (ja) man pages for guestfs-tools"
DESCRIPTION = "guestfs-tools-man-pages-ja contains Japanese (ja) man pages \
for guestfs-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "guestfs-tools-man-pages-ja-1.50.1-1.1.noarch.rpm"
RPM_HASH = "c919740c509ff4f9367293ec092a83d02d85b073f8d1ea845ff7c85f45b8a21a9c2e81aab04e48b5c837ab6d1343f6add324de732fd8b687eeb9ae825d03d8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-man-pages-ja"

RDEPENDS:${PN} += "guestfs-tools"

inherit rpm
