SUMMARY = "EFI Boot Manager"
DESCRIPTION = "The EFI Boot Manager allows the user to edit the Intel Extensible \
Firmware Interface (EFI) Boot Manager variables.  Additional \
information about the EFI can be found at \
<http://developer.intel.com/technology/efi/efi.htm>."
LICENSE = "GPL-2.0-or-later"

PV = "18"

RPM_NAME = "efibootmgr-18-1.2.aarch64.rpm"
RPM_HASH = "f2a7a5e292cc3edf03ac19c6b690fd8960de182f52eea2b4d0d72b41975055fffe79c51780f7c75851a86b7b9839a83a7b4da6e582b641c766061a18dbd66205"

RPROVIDES:${PN} += "efibootmgr efibootmgr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libefiboot.so.1()(64bit) libefiboot.so.1(LIBEFIBOOT_1.31)(64bit) libefiboot.so.1(libefiboot.so.0)(64bit) libefivar.so.1()(64bit) libefivar.so.1(LIBEFIVAR_0.24)(64bit) libefivar.so.1(LIBEFIVAR_1.30)(64bit) libefivar.so.1(LIBEFIVAR_1.36)(64bit) libefivar.so.1(libefivar.so.0)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
