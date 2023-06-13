SUMMARY = "Development files for the D runtime library"
DESCRIPTION = "This package contains the druntime development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-runtime-devel-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "61e44ca3ffb078ea1e96a1b83354dbd8acf0ff2433d5facda7ef8506b281285b968a67bed81430fdbb8ace06bd0e7d640f057cefd5d9d12e40d48be077402a63"

RPROVIDES:${PN} += "ldc-runtime-devel \
ldc-runtime-devel(aarch-64)"

RDEPENDS:${PN} += "libdruntime-ldc102"

inherit rpm
