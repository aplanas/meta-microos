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

RPM_NAME = "perl-FileHandle-Unget-0.1634-1.16.noarch.rpm"
RPM_HASH = "6eb747a8b2346a3f2c8f0727d12ecb5212ba68f08ecfe7d9264ec8868920d17e63c52cbb8255cd7db608a57fb2333d3be2eecced0c892a30ab148c0e40aeb34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FileHandle--Unget \
perl-FileHandle--Unget--Tie \
perl-FileHandle-Unget"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
