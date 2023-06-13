SUMMARY = "Perl extension for statvfs() and fstatvfs()"
DESCRIPTION = "Interface for statvfs() and fstatvfs() \
 \
Unless you need access to the bsize, flag, and namemax values, you should \
probably look at using Filesys::DfPortable or Filesys::Df instead. They \
will generally provide you with more functionality and portability. \
 \
The module should work with all flavors of Unix that implement the \
'statvfs()' and 'fstatvfs()' calls. This would include Linux, *BSD, HP-UX, \
AIX, Solaris, Mac OS X, Irix, Cygwin, etc ... \
 \
The 'statvfs()' and 'fstatvfs()' functions will return a list of values, or \
will return 'undef' and set '$!' if there was an error. \
 \
The values returned are described in the statvfs/fstatvfs header or the \
'statvfs()/fstatvfs()' man page. \
 \
The module assumes that if you have 'statvfs()', 'fstatvfs()' will also be \
available."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.82"

RPM_NAME = "perl-Filesys-Statvfs-0.82-1.31.aarch64.rpm"
RPM_HASH = "8c3b13d543803579a9c1b71a5397a53e256ee424b9a93e7b85d4a29ef9feae38087c1cfb7bc20f3ca05bc4b00cf948793689b429b08392f5936260cb90525cb5"

RPROVIDES:${PN} += "perl(Filesys::Statvfs) \
perl-Filesys-Statvfs \
perl-Filesys-Statvfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
