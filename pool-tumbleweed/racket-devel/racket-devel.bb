SUMMARY = "Development header files for Racket"
DESCRIPTION = "This package contains the symlinks, headers and object files needed to \
compile and link programs which use Racket."
LICENSE = "Apache-2.0 | MIT"

PV = "8.9"

RPM_NAME = "racket-devel-8.9-1.3.aarch64.rpm"
RPM_HASH = "86c9963ef8d87cbe3dd0be4b5b08de487a19810a651c52ed1c80b96bc78c2986ea5b19a5dd6557073c7b689daa90c36cd783246666826858676e4d0798401697"

RPROVIDES:${PN} += "racket-devel"

RDEPENDS:${PN} += "glibc-devel \
libffi-devel \
racket"

inherit rpm
