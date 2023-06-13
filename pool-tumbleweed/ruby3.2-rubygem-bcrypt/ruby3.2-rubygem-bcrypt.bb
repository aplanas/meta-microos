SUMMARY = "OpenBSD's bcrypt() password hashing algorithm"
DESCRIPTION = "bcrypt() is a sophisticated and secure hash algorithm designed by The \
OpenBSD project \
for hashing passwords. The bcrypt Ruby gem provides a simple wrapper for \
safely handling \
passwords."
LICENSE = "MIT"

PV = "3.1.18"

RPM_NAME = "ruby3.2-rubygem-bcrypt-3.1.18-1.7.aarch64.rpm"
RPM_HASH = "4c7704156d9c7bf6ddcbfdfb70a254d946da19d0f3c287bc3b9a1812b817c8dbc372dfa80d7deeb57d2c17ba167cbffe9f3c08c2fcab6c26276f1d3c238c780d"

RPROVIDES:${PN} += "ruby3.2-rubygem-bcrypt \
ruby3.2-rubygem-bcrypt(aarch-64) \
rubygem(bcrypt) \
rubygem(ruby:3.2.0:bcrypt) \
rubygem(ruby:3.2.0:bcrypt:3) \
rubygem(ruby:3.2.0:bcrypt:3.1) \
rubygem(ruby:3.2.0:bcrypt:3.1.18)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
