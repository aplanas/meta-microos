SUMMARY = "Perl access to fsync() and sync() function calls"
DESCRIPTION = "The fsync() function takes a Perl file handle as its only argument, and \
passes its fileno() to the C function fsync(). It returns _undef_ on \
failure, or _true_ on success. \
 \
The fsync_fd() function is used internally by fsync(); it takes a file \
descriptor as its only argument. \
 \
The sync() function is identical to the C function sync(). \
 \
This module does *not* export any methods by default, but fsync() is made \
available as a method of the _FileHandle_ and _IO::Handle_ classes."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-File-Sync-0.11-10.38.aarch64.rpm"
RPM_HASH = "792f6f60bc44794619194d5ccedacdeac1a28f2197c99ed20a68be26270b47dfa69e883882064abac39907934a309e9372e9befc083560a6404323b1ab51ad23"

RPROVIDES:${PN} += "perl-File--Sync \
perl-File-Sync"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
