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

RPM_NAME = "perl-File-Sync-0.11-10.39.aarch64.rpm"
RPM_HASH = "33f1c854f88a6fc860f6e136dd31faf54d1d2e966bb10058fcf0345a649d88d4f565bdeeb9a424651fec9d9a07c69b97cf514c2f8ef81787e0c454f6b0365821"

RPROVIDES:${PN} += "perl-File--Sync \
perl-File-Sync"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
