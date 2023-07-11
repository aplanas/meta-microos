SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-bpf-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "e376a3a71852f1ca60ae57074aa1386413270631b300b4ac0b362066c405eec9ffc7ff6354d70d416e526afae329c9398693958ee3115a495192aa10da1395ad"

RPROVIDES:${PN} += "cross-bpf-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-bpf-binutils \
update-alternatives"

inherit rpm
