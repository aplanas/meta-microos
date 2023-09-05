SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.4.12_1"

RPM_NAME = "hdjmod-kmp-default-1.34_k6.4.12_1-1.18.aarch64.rpm"
RPM_HASH = "97ed5fd26840f52bf41ca20390ecaf64183fc5094ef5c247ff0403ad5801f6e2ec49ce8872978090ebaa499ff09717054c272b4f88b71d8cd4fbfdf8a6abd4b2"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default-k6.4.12-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
