SUMMARY = "Perl extension for the GNU Readline/History Library"
DESCRIPTION = "This is an implementation of Term::ReadLine using the GNU Readline/History \
Library. \
 \
For basic functions object oriented interface is provided. These are \
described in the section 'Standard Methods' and 'Term::ReadLine::Gnu \
Functions'. \
 \
This package also has the interface with the almost all functions and \
variables which are documented in the GNU Readline/History Library Manual."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.45"

RPM_NAME = "perl-Term-ReadLine-Gnu-1.45-1.2.aarch64.rpm"
RPM_HASH = "dfa356a9e555507e1d0ad5ffc0052f05d43db49d3908d354587dc972a6cf7b38a44989cf91fc82b196a93ddd84ef69f4db9d3f6a942e48027c93ed503f2a493e"

RPROVIDES:${PN} += "perl(Term::ReadLine::Gnu) \
perl(Term::ReadLine::Gnu::AU) \
perl(Term::ReadLine::Gnu::Var) \
perl(Term::ReadLine::Gnu::XS) \
perl-Term-ReadLine-Gnu \
perl-Term-ReadLine-Gnu(aarch-64) \
perl-TermReadLine-Gnu"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libreadline.so.8()(64bit) \
libreadline.so.8(READLINE_6.3)(64bit) \
libreadline.so.8(READLINE_7.0)(64bit) \
libreadline.so.8(READLINE_8.0)(64bit) \
libreadline.so.8(READLINE_8.1)(64bit) \
libreadline.so.8(READLINE_8.2)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
