SUMMARY = "C/C++ function declaration translator"
DESCRIPTION = "Cdecl is a program which will turn English-like phrases such as \
'declare foo as array 5 of pointer to function returning int' into C \
declarations such as 'int (*foo[5])()' and vice-versa. It handles \
typecasts and C++ as well, and offers command line editing and \
history."
LICENSE = "GPL-3.0-or-later"

PV = "14.3"

RPM_NAME = "cdecl-14.3-1.1.aarch64.rpm"
RPM_HASH = "3a747310d850a4337af0057f0600bc22c412de1a9721f78d0be1a25aa223c4cbbfa67470fcfecbcad4ab00e92f56954e67758ccbeb47c4bd8f3da75bc7380d2a"

RPROVIDES:${PN} += "cdecl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
