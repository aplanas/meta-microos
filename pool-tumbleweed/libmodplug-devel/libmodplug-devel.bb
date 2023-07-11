SUMMARY = "Development files for libmodplug"
DESCRIPTION = "Files needed to program against libmodplug."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.9.0+git20170610.f6dd59a"

RPM_NAME = "libmodplug-devel-0.8.9.0+git20170610.f6dd59a-2.9.aarch64.rpm"
RPM_HASH = "5c0f48103f000a86ba8478ced9a3e5c611d4ad2a12b79aee841cf5ab94e575ed5eaa38a0967cde253e94e9f8c63f102157797698ccdf48237a5831d62b0b7d2e"

RPROVIDES:${PN} += "libmodplug-devel \
pkgconfig-libmodplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodplug1"

inherit rpm
