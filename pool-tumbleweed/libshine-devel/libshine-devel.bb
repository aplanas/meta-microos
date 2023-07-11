SUMMARY = "Development files for libshine, an MP3 encoding library"
DESCRIPTION = "The libshine-devel package contains libraries and header files for \
developing applications that use libshine."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libshine-devel-3.1.1-1.7.aarch64.rpm"
RPM_HASH = "32e80d89bfd7f71bd6b1b16c756d22aec47c80b7ead3f2f0507f86bd49fa6d62cab2878fc1801f2a4ee6f8222ad70be2bcaf09551edd187e54f1aa54d899a03f"

RPROVIDES:${PN} += "libshine-devel \
pkgconfig-shine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshine3"

inherit rpm
