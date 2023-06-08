SUMMARY = "Development libraries for the Courier authentication library"
DESCRIPTION = "This package contains the development libraries and files needed to \
compile Courier packages that use this authentication library.	Install \
this package in order to build the rest of the Courier packages.  After \
they are built and installed this package can be removed.  Files in \
this package are not needed at runtime."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-devel-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "8fb0cf8d45f07fe5053712b9b4f51eb86bbdaa8d41525f837a1673f7b87265ae6d291096228c3c3ab718263250c736ed684b9c58b8fad34be20335f20de52316"

RPROVIDES:${PN} += "courier-authlib-devel courier-authlib-devel(aarch-64)"
RDEPENDS:${PN} += "courier-authlib courier-authlib-ldap courier-authlib-mysql courier-authlib-pgsql courier-authlib-pipe courier-authlib-sqlite courier-authlib-userdb ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
