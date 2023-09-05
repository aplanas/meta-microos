SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-bpf-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "43ad05908b44483a5664efea22ee36ba7640db9085b2a800744d0a50eb5338f12b5cc0834fb398a92dc4646cdb5de953565d81730889f00ada8798498eff9204"

RPROVIDES:${PN} += "cross-bpf-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-bpf-binutils \
update-alternatives"

inherit rpm
