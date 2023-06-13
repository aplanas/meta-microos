SUMMARY = "Development files for the readline library version 5"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "readline5-devel-5.2-140.3.aarch64.rpm"
RPM_HASH = "c5cf3bc7653263c9ee06d793c39cd05c8c155e17ab5422cf85103187aee03b8bca2030a4a46365dae9f9bd7b26ce3c532badda9ba4c8d8f5e78b8bae50360f08"

RPROVIDES:${PN} += "bash:/usr/lib64/libreadline.a \
readline5-devel \
readline5-devel(aarch-64)"

RDEPENDS:${PN} += "libreadline5 \
ncurses-devel"

inherit rpm
