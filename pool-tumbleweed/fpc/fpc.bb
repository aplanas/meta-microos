SUMMARY = "Free Pascal Compiler"
DESCRIPTION = "Freepascal is a free 32/64bit Pascal Compiler. It comes with a run-time \
library and is fully compatible with Turbo Pascal 7.0 and nearly Delphi \
compatible. Some extensions are added to the language, like function \
overloading and generics. Shared libraries can be linked. This package \
contains commandline compiler and utils. Provided units are the runtime \
library (RTL), free component library (FCL) and the base and extra \
packages."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-3.2.2-3.10.aarch64.rpm"
RPM_HASH = "305fb17e5db3d76390bfd9e96a62c701ac624c7eb07d5cd74cbad6ca9815a0037e31d42aa6a4131e653ae468d6c68f87ab46f560a4bf0cb86790f3d4ee38d115"

RPROVIDES:${PN} += "config-fpc \
fpc \
libpas2jslib.so"

RDEPENDS:${PN} += "/usr/bin/sh \
binutils \
libc.so.6"

inherit rpm
