SUMMARY = "Ukrainian (uk) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-uk contains Ukrainian (uk) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-uk-1.50.1-4.1.noarch.rpm"
RPM_HASH = "da287790799614594b98d285e41c1f89e37f56558f655397317282b7c4260b64fef64ad7f106eb2a31c19f93d539ab6772fd7f9a79b4c695a910b288faa8eacf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-uk"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
