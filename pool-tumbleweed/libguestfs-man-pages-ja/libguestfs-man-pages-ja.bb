SUMMARY = "Japanese (ja) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-ja contains Japanese (ja) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-ja-1.50.1-4.1.noarch.rpm"
RPM_HASH = "24575f32e398a7c6b561ec9cc3415b3a4804b9dcbc5fab951c8093a0453a7e0f7605dea4219cf690c230731fe42e982b76123e138be0d6ef75202321192c822c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-ja"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
