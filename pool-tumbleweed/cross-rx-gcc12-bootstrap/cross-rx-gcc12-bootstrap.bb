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

PV = "12.3.0+git1204"

RPM_NAME = "cross-rx-gcc12-bootstrap-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "6fb5b3c2cb35cc1856e6523745a9580cdbf782a003332f471083675ef4dad428e1f2d3d71c0189cb642d33173b2680c38041b4ba88ab2ef85749b739cadee93a"

RPROVIDES:${PN} += "cross-rx-gcc12-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
update-alternatives"

inherit rpm
