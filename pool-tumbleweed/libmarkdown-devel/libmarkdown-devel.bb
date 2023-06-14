SUMMARY = "Markdown text to HTML converter library"
DESCRIPTION = "Discount is an implementation of John Gruber’s Markdown text to HTML language \
with some extensions from PHP Markdown Extra, Pandoc, and other implementations \
of Markdown."
LICENSE = "BSD-3-Clause"

PV = "3.0.0a"

RPM_NAME = "libmarkdown-devel-3.0.0a-1.1.aarch64.rpm"
RPM_HASH = "c3356d96b16d60134b00671cfbbf020b77fe2e49b4031f06b9eb694e7108b084def5626fe5674b776ccb5de59e896d5778db12954a7370ce16291f9ccfdae795"

RPROVIDES:${PN} += "libmarkdown-devel \
pkgconfig-libmarkdown"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmarkdown3"

inherit rpm
