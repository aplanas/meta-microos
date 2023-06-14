SUMMARY = "Development files for libshine, an MP3 encoding library"
DESCRIPTION = "The libshine-devel package contains libraries and header files for \
developing applications that use libshine."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libshine-devel-3.1.1-1.6.aarch64.rpm"
RPM_HASH = "a26db7a8b03587e7540f2eaeaa1f2b9b158dcf2aee4df8f6e94bf1388cae90a5b6b00df2e61a32797f99a8d21685c36c3df3df24e81513d02e2001c43144b00f"

RPROVIDES:${PN} += "libshine-devel \
pkgconfig-shine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshine3"

inherit rpm
