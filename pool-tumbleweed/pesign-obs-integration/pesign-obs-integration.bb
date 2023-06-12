SUMMARY = "Macros and scripts to sign the kernel and bootloader"
DESCRIPTION = "This package provides scripts and rpm macros to automate signing of the \
boot loader, kernel and kernel modules in the openSUSE Buildservice."
LICENSE = "GPL-2.0-only"

PV = "10.2+git20220504.8690743"

RPM_NAME = "pesign-obs-integration-10.2+git20220504.8690743-5.1.aarch64.rpm"
RPM_HASH = "1275a34a5c06f38487b5bea161152f87e7deeaeebbbed5b17d475bded7e4e8680b9d00b9d597575cc21af67f377b4df06c5a087fcfb292329d2315a8abee139c"

RPROVIDES:${PN} += "pesign-obs-integration \
pesign-obs-integration(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
fipscheck \
mozilla-nss-tools \
openssl \
pesign \
suse-module-tools"

inherit rpm
