SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-mips-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "332fb63c5a86ddf01fc56a155d72b2686d6f3506c599faae1bea2e7aac0536741f5d731b145e3d15e7ad7f797830a65ee2e0b00840de0c82626e139c9edc6c80"

RPROVIDES:${PN} += "cross-mips-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
