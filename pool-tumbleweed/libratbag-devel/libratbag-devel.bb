SUMMARY = "Development files for the libratbag game mouse config library"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the files needed to build programs with \
libratbag."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libratbag-devel-0.17-2.1.aarch64.rpm"
RPM_HASH = "c111df0c5b54025cd3251f90bfc281139995b593b65c3e476ef70bf90e00173bcaf3c8a31079d579e2a8ce37d6c6d02ef3e3cce9bdd30cc45a27b88c5eef2e97"

RPROVIDES:${PN} += "libratbag-devel \
libratbag-devel(aarch-64) \
pkgconfig(liblur)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblur3"

inherit rpm
