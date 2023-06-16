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

RPM_NAME = "fpc-3.2.2-3.9.aarch64.rpm"
RPM_HASH = "58c9c97971d21400252512c49b996b722aa0e2446b043ee1dc6dfc108de1544a3faa233e54fd9c9770fd75d443256c55886159abfef319e0f5fbd4149304716a"

RPROVIDES:${PN} += "config-fpc \
fpc \
libpas2jslib.so"

RDEPENDS:${PN} += "/usr/bin/sh \
binutils \
libc.so.6"

inherit rpm
