SUMMARY = "A secure and free password manager for all of your devices"
DESCRIPTION = "Bitwarden is a free and open-source password management service that stores sensitive information such as website credentials in an encrypted vault.  Bitwarden offers a cloud-hosted service as well as the ability to deploy the solution on-premises. This package provides the GUI client."
LICENSE = "GPL-3.0-only & MIT & (Apache-2.0 | MIT)"

PV = "2023.4.0"

RPM_NAME = "bitwarden-2023.4.0-1.1.aarch64.rpm"
RPM_HASH = "489fd6d8b5e219cf7fefb6b3105c771d9a74893f7bc718d7464ca8c35a4ea6bd19c6a855fd9a39a26a225166e2bf0a03ddcefd397bddcd429ddaef89ef3831e8"

RPROVIDES:${PN} += "application() application(bitwarden.desktop) bitwarden bitwarden(aarch-64) mimehandler(x-scheme-handler/bitwarden)"
RDEPENDS:${PN} += "(google-opensans-fonts or open-sans-fonts) /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libargon2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsecret-1.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) nodejs-electron(aarch-64)"

inherit rpm
