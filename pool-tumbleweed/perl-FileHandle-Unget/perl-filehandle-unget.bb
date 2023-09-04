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

RPM_NAME = "perl-FileHandle-Unget-0.1634-1.18.noarch.rpm"
RPM_HASH = "6258efafddb8db2bfff9b04e3c78d7e0bb0d6f633ba007f6eee6558519bd6072656e3f3c1570f9524fab0cd32bbc63de41613c0af4771e0b1c1c5caef8ec7442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FileHandle--Unget \
perl-FileHandle--Unget--Tie \
perl-FileHandle-Unget"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
