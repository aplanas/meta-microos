SUMMARY = "Development header files for Racket"
DESCRIPTION = "This package contains the symlinks, headers and object files needed to \
compile and link programs which use Racket."
LICENSE = "Apache-2.0 | MIT"

PV = "8.9"

RPM_NAME = "racket-devel-8.9-1.1.aarch64.rpm"
RPM_HASH = "b7c13419ee002f6f69e46fd99c61c52a80ff1abf768c93f6fa7d9fd978e198843faf7c5c6aed1ecb338e525a3ef2e92236c6d8d964db87ff05eb816d559aa535"

RPROVIDES:${PN} += "racket-devel"

RDEPENDS:${PN} += "glibc-devel \
libffi-devel \
racket"

inherit rpm
