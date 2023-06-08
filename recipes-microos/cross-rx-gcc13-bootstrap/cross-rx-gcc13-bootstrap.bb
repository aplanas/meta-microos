SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-rx-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "1e69c86dfb98f9dfbed46c907eeacc49bbb45e84e479091b917779737cbd33f57a955ee4d48cc82963d28e507e89f2227c7751f2f87e764dcddcdfe2d80e21e7"

RPROVIDES:${PN} += "cross-rx-gcc13-bootstrap cross-rx-gcc13-bootstrap(aarch-64) rx-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-rx-binutils update-alternatives"

inherit rpm
