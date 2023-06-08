SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-bpf-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "935e44283c4ab39fd4dbbf76fa5902206362ec3ebedbce02862ae5890f2f6ebf4725dc5d6986c0f31a0a7fdd695822a48af3080426dbc299ea6b77d76b9ec31c"

RPROVIDES:${PN} += "cross-bpf-gcc13 cross-bpf-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-bpf-binutils update-alternatives"

inherit rpm
