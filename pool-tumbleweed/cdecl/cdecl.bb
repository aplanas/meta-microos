SUMMARY = "C/C++ function declaration translator"
DESCRIPTION = "Cdecl is a program which will turn English-like phrases such as \
'declare foo as array 5 of pointer to function returning int' into C \
declarations such as 'int (*foo[5])()' and vice-versa. It handles \
typecasts and C++ as well, and offers command line editing and \
history."
LICENSE = "GPL-3.0-or-later"

PV = "14.4"

RPM_NAME = "cdecl-14.4-1.1.aarch64.rpm"
RPM_HASH = "c40356c7cec5135f6f5fbe4d29d0a7dbbf579ee926a79c50473008810be4ed93587b2cc6e7096d37da7d750c5a315a01aa72a03d3d82ed9df2595e3df57ef6ba"

RPROVIDES:${PN} += "cdecl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
