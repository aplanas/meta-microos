SUMMARY = "Not Quite Perl"
DESCRIPTION = "This is 'Not Quite Perl' -- a lightweight Raku-like environment for virtual \
machines. The key feature of NQP is that it's designed to be a very small \
environment (as compared with, say, raku or Rakudo) and is focused on being \
a high-level way to create compilers and libraries for virtual machines like \
MoarVM, the JVM, and others. \
 \
Unlike a full-fledged implementation of Raku, NQP strives to have as small a \
runtime footprint as it can, while still providing a Raku object model and \
regular expression engine for the virtual machine."
LICENSE = "Artistic-2.0"

PV = "2022.07"

RPM_NAME = "nqp-2022.07-1.2.aarch64.rpm"
RPM_HASH = "299b193835e6655bbe84b3fb7c29f0fe2f0ad6d7d5eec4464ad6d2a6eb9192a7731930ca671c3f250a28ba5c48b09ee4c08a85e1bb4143edb10f904cabbf9d75"

RPROVIDES:${PN} += "nqp \
nqp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmoar.so()(64bit) \
moarvm"

inherit rpm
