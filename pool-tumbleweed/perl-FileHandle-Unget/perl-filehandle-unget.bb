SUMMARY = "FileHandle which supports multi-byte unget"
DESCRIPTION = "FileHandle::Unget operates exactly the same as FileHandle, except that it \
provides a version of ungetc that allows you to unget more than one \
character. It also provides ungets to unget a string. \
 \
This module is useful if the filehandle refers to a stream for which you \
can't just 'seek()' backwards. Some operating systems support multi-byte \
'ungetc()', but this is not guaranteed. Use this module if you want a \
portable solution. In addition, on some operating systems, eof() will not \
be reset if you ungetc after having read to the end of the file. \
 \
NOTE: Using 'sysread()' with 'ungetc()' and other buffering functions is \
still a bad idea."
LICENSE = "GPL-2.0-or-later"

PV = "0.1634"

RPM_NAME = "perl-FileHandle-Unget-0.1634-1.17.noarch.rpm"
RPM_HASH = "8fb05e2795b9e325d286e91ff5cfc5886c5274d8aaf2368e29d2e9f952e3a02dc805e6c2006605f6f1a3d69e3f6c5a8f58c586357ec68cac303e9134be954116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FileHandle--Unget \
perl-FileHandle--Unget--Tie \
perl-FileHandle-Unget"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
