SUMMARY = "A plug-in framework for C++"
DESCRIPTION = "C-Pluff is a plug-in framework for C++ programs."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluffxx0-0.2.0-2.9.aarch64.rpm"
RPM_HASH = "936801c9aa94b9cc866a8e31d56e217cd33dbe6c70550be264b6c03aac880a768f148a4640013cfed1a915997ddff11f676e3e85525024a5e9e0e743d15350b5"

RPROVIDES:${PN} += "libcpluffxx.so.0 \
libcpluffxx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpluff.so.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
