SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-bpf-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "354696aa2cc8e47526237c42d6fef2856c74ae413ff046f3780e79f193dce5ec154b12205520875717cef14557de5d8438a81a124844d6bd0dc8558d8833be0b"

RPROVIDES:${PN} += "cross-bpf-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-bpf-binutils \
update-alternatives"

inherit rpm
