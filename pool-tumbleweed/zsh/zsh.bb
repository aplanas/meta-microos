SUMMARY = "Shell with comprehensive completion"
DESCRIPTION = "Zsh is a UNIX command interpreter (shell) that resembles the Korn shell \
(ksh). It is not completely compatible. It includes many enhancements, \
notably in the command-line editor, options for customizing its \
behavior, file name globbing, features to make C-shell (csh) users feel \
at home, and extra features drawn from tcsh (another `custom' shell). \
Zsh is well known for its command line completion."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-5.9-5.3.aarch64.rpm"
RPM_HASH = "c5fe9fd0c74e970345024900afa327db143235e444441446049b1e8279c2030554d2ebad885db5aaf5b4e6665f26b7730bdc8051af1b7a3bfb76a6d8c0bf8155"

RPROVIDES:${PN} += "/usr/bin/zsh \
config-zsh \
zsh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libm.so.6 \
libncursesw.so.6 \
libpcre.so.1 \
libtinfo.so.6"

inherit rpm
