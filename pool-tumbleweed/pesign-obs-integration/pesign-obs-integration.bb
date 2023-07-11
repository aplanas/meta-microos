SUMMARY = "Macros and scripts to sign the kernel and bootloader"
DESCRIPTION = "This package provides scripts and rpm macros to automate signing of the \
boot loader, kernel and kernel modules in the openSUSE Buildservice."
LICENSE = "GPL-2.0-only"

PV = "10.2+git20230612.4699910"

RPM_NAME = "pesign-obs-integration-10.2+git20230612.4699910-2.1.aarch64.rpm"
RPM_HASH = "a3926a5e24303fe977be3d5dce9616842d003f872329c61c17e6b2a95def54561effd991ce04ecdead335aca4e898ad860e0d581e0ca38d541aecfa0806e93c2"

RPROVIDES:${PN} += "pesign-obs-integration"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
fipscheck \
mozilla-nss-tools \
openssl \
pesign \
suse-module-tools"

inherit rpm
