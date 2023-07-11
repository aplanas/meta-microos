SUMMARY = "Development libraries for the Courier authentication library"
DESCRIPTION = "This package contains the development libraries and files needed to \
compile Courier packages that use this authentication library.	Install \
this package in order to build the rest of the Courier packages.  After \
they are built and installed this package can be removed.  Files in \
this package are not needed at runtime."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-devel-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "30443a41516cd42ae74461f1d04e1b52df6022347a04e995fb375a623e7e9136a5dc0f9a1eae399599221e623bf931f1939f0c820c01b1c3f8ddb22bed37f579"

RPROVIDES:${PN} += "courier-authlib-devel"

RDEPENDS:${PN} += "courier-authlib \
courier-authlib-ldap \
courier-authlib-mysql \
courier-authlib-pgsql \
courier-authlib-pipe \
courier-authlib-sqlite \
courier-authlib-userdb \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
