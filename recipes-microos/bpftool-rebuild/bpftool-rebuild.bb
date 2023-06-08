SUMMARY = "Empty package to ensure rebuilding bpftool in OBS"
DESCRIPTION = "This is empty package that ensures bpftool is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "bpftool-rebuild-6.3.1-8.11.aarch64.rpm"
RPM_HASH = "b1a3fbc2bd335a8fe971be0ab3485ebb0a6f75942746d96639310b851ebf005e46379d3a7fc1f3b35e5682198d83fec062e36fb50f30d35f88194f81f6bce6b7"

RPROVIDES:${PN} += "bpftool-rebuild bpftool-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm
