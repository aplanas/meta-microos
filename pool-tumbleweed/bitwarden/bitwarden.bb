SUMMARY = "A secure and free password manager for all of your devices"
DESCRIPTION = "Bitwarden is a free and open-source password management service that stores sensitive information such as website credentials in an encrypted vault.  Bitwarden offers a cloud-hosted service as well as the ability to deploy the solution on-premises. This package provides the GUI client."
LICENSE = "GPL-3.0-only & MIT & (Apache-2.0 | MIT)"

PV = "2023.5.0"

RPM_NAME = "bitwarden-2023.5.0-1.1.aarch64.rpm"
RPM_HASH = "758b7fa8a54e5cb1f31cf3ed357012b831cfed53ee6ff5fd47d162a2063e33f3285b286b84fd7af41684d8edbc1481b8b6e936169e8c1922776332c40dd90869"

RPROVIDES:${PN} += "application() \
application(bitwarden.desktop) \
bitwarden \
bitwarden(aarch-64) \
mimehandler(x-scheme-handler/bitwarden)"

RDEPENDS:${PN} += "(google-opensans-fonts or open-sans-fonts) \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libargon2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
nodejs-electron(aarch-64)"

inherit rpm
