SUMMARY = "Courier Unicode Library - Development files"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libunicode library."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.6"

RPM_NAME = "courier-unicode-devel-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "d35cebc19c2853201cd48974b87a8c6aed4be219e66109771bb8fba06031e2452996111ac98c9fa76ad89e0d91d64e7bebdf60b3073f6802f58d6dc440e3f166"

RPROVIDES:${PN} += "courier-unicode-devel courier-unicode-devel(aarch-64) libcourier-unicode-devel"
RDEPENDS:${PN} += "libcourier-unicode7"

inherit rpm
