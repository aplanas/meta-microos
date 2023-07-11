SUMMARY = "Magnetic tape control"
DESCRIPTION = "The mt/smt program sends commands to a local or a remote magnetic \
tape drive."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "schily-mt-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "ffbf7549a49b2c5a17ced572b2736324c50ac42015d960d16362eb8b3cda894539ff8a49504864c1eb6475940fa606afce5db6cb5f7be2e9370e9ecad6689c2b"

RPROVIDES:${PN} += "mt \
schily-mt \
star-rmt-/usr/bin/smt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
librmt.so.1.0 \
libschily.so.2.0 \
update-alternatives"

inherit rpm
