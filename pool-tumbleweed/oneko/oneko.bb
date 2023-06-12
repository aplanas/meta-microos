SUMMARY = "A Cat Catches Your Mouse"
DESCRIPTION = "A nice program that changes your cursor into a cat playing with your \
mouse cursor.  The manual page shows more possibilities to change your \
cursor."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.sakura.5"

RPM_NAME = "oneko-1.2.sakura.5-1.8.aarch64.rpm"
RPM_HASH = "c19f115b598343d0aa699fad43f47c481f8480a8cad2d4caa44f2980d50df3b0c54fd5ec3d18d529d7baf3c786af5f4e54a00ee641bf2972d71d9ddc371818a9"

RPROVIDES:${PN} += "oneko \
oneko(aarch-64)"
RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
