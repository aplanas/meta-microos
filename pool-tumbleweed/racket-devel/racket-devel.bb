SUMMARY = "Development header files for Racket"
DESCRIPTION = "This package contains the symlinks, headers and object files needed to \
compile and link programs which use Racket."
LICENSE = "Apache-2.0 | MIT"

PV = "8.10"

RPM_NAME = "racket-devel-8.10-1.1.aarch64.rpm"
RPM_HASH = "d061d2feb372571dec98b3e2cd2305b040b1f057cfcf41e8c421772e4ee1d7ea84454e0eb18707065f09b4bcc5b0467ed9d7a1d53e9ea25c8d677c20fcf1b1a5"

RPROVIDES:${PN} += "racket-devel"

RDEPENDS:${PN} += "glibc-devel \
libffi-devel \
racket"

inherit rpm
