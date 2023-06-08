SUMMARY = "Include-files and documentation for ccrtp"
DESCRIPTION = "This package contains files needed when developing applications using \
ccrtp."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "ccrtp-devel-2.1.2-2.27.aarch64.rpm"
RPM_HASH = "93f01470ce0f52a2582249c448e001e797be8385316001f69b8607e0d1825127d487d449e63748992811b199ff358eeecff42013d87ba200c27b0761be33cf66"

RPROVIDES:${PN} += "ccrtp-devel ccrtp-devel(aarch-64) libccrtp-devel libccrtp3-devel pkgconfig(libccrtp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libccrtp3 libgcrypt-devel pkgconfig(commoncpp) ucommon-devel"

inherit rpm
