SUMMARY = "Update file access and modification times, optionally creating files if needed"
DESCRIPTION = "This module provides both a functional and OO interface for changing the \
file access and modification times on files. It can optionally create the \
file for you, if it doesn't exist. \
 \
*Note*: you should specify a minimum version of 0.12, as per the SYNOPSIS, \
as that fixed an issue that affected systems that have sub-second \
granularity on those file times. \
 \
Here's a list of arguments that can be used with the object-oriented \
contruction: \
 \
* atime_only => [0|1] \
 \
If nonzero, change only the access time of files. Default is zero. \
 \
* mtime_only => [0|1] \
 \
If nonzero, change only the modification time of files. Default is zero. \
 \
* no_create => [0|1] \
 \
If nonzero, do not create new files. Default is zero. \
 \
* reference => $reference_file \
 \
If defined, use timestamps from this file instead of current time. The \
timestamps are read from the reference file when the object is created, not \
when '<-'touch>> is invoked. Default is undefined. \
 \
* time => $time \
 \
If defined, then this value will be used for both access time and \
modification time, whichever of those are set. This time is overridden by \
the 'atime' and 'mtime' arguments, if you use them. \
 \
* atime => $time \
 \
If defined, use this time (in epoch seconds) instead of current time for \
access time. \
 \
* mtime => $time \
 \
If defined, use this time (in epoch seconds) instead of current time for \
modification time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.12"

RPM_NAME = "perl-File-Touch-0.12-1.12.noarch.rpm"
RPM_HASH = "3a491d4d2c3f02a3d5a2cb0a6328bd2c86f51b08ca886361b8ddda0bae4528c7f4f84e5276c8ee17c720d9e5bfe4ef4d0525256d73b4696b98151ca80bba6f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Touch \
perl-File-Touch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Time--HiRes"

inherit rpm
