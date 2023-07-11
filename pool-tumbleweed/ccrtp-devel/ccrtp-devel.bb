SUMMARY = "Include-files and documentation for ccrtp"
DESCRIPTION = "This package contains files needed when developing applications using \
ccrtp."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "ccrtp-devel-2.1.2-2.28.aarch64.rpm"
RPM_HASH = "4a4df43d3c7e383b77db65375cb57a75e88db54c565de867f0bdb15b9996dac61d82b872f90e57ca4b757ef166c1f51f039c346f58fcfb3a4ae056921801ce56"

RPROVIDES:${PN} += "ccrtp-devel \
libccrtp-devel \
libccrtp3-devel \
pkgconfig-libccrtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libccrtp3 \
libgcrypt-devel \
pkgconfig-commoncpp \
ucommon-devel"

inherit rpm
