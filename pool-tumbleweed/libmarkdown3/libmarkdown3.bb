SUMMARY = "Markdown text to HTML converter library"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.0a"

RPM_NAME = "libmarkdown3-3.0.0a-1.1.aarch64.rpm"
RPM_HASH = "68f30de76cace2358e03d544a0e6ba1e8ec5eb2d532ab4ae74f3d6a0412e4af7d0b7f60f3cc3aa2b618d5b162207144e3efacee57432c93aab2a0d1fe7366be7"

RPROVIDES:${PN} += "libmarkdown.so.3()(64bit) \
libmarkdown3 \
libmarkdown3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
