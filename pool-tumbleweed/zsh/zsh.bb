SUMMARY = "Shell with comprehensive completion"
DESCRIPTION = "Zsh is a UNIX command interpreter (shell) that resembles the Korn shell \
(ksh). It is not completely compatible. It includes many enhancements, \
notably in the command-line editor, options for customizing its \
behavior, file name globbing, features to make C-shell (csh) users feel \
at home, and extra features drawn from tcsh (another `custom' shell). \
Zsh is well known for its command line completion."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-5.9-6.1.aarch64.rpm"
RPM_HASH = "de1b4390a65287c7d69bd2ea0ce223bb0a770fc76de35b54b55070095ca84d57d292a2f8ea95123a2ba2980a84a42784c3a957adca966c4d1630480993568cd6"

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
