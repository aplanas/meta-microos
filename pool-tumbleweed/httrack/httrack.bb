SUMMARY = "Offline Browser Utility"
DESCRIPTION = "HTTrack is a free (GPL, libre/free software) and easy-to-use offline \
browser utility. \
 \
It allows you to download a World Wide Web site from the Internet to a \
local directory, building recursively all directories, getting HTML, \
images, and other files from the server to your computer. HTTrack \
arranges the original site's relative link-structure. Simply open a page \
of the 'mirrored' website in your browser, and you can browse the site \
from link to link, as if you were viewing it online. HTTrack can also \
update an existing mirrored site, and resume interrupted downloads. \
 \
HTTrack is fully configurable, and has an integrated help system."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "httrack-3.49.2-2.8.aarch64.rpm"
RPM_HASH = "e9b57b8202530c872863c7899e3695649eb71074562b6af18e77f07fb53f7fd6825470ddcf9d5847959d1c7b2d85c500d5702491092b2ba3c9e2ba627e54fa6e"

RPROVIDES:${PN} += "application() \
application(WebHTTrack-Websites.desktop) \
application(WebHTTrack.desktop) \
httrack \
httrack(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhttrack.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
