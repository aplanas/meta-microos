SUMMARY = "A utility for running arbitrary commands when files change"
DESCRIPTION = "A utility for running arbitrary commands when files change. Uses \
inotify(7) to avoid polling."
LICENSE = "ISC"

PV = "5.3"

RPM_NAME = "entr-5.3-1.2.aarch64.rpm"
RPM_HASH = "3bcfc2fc1cbe25fd423b2d293ee2328b88070f3aca5870ae16b9adf59596b0142bb5b44577811dcf578a287e22a2a5e9cbc83f943d9f8e0937bb17783e644c68"

RPROVIDES:${PN} += "entr \
entr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
