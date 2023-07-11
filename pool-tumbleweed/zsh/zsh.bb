SUMMARY = "Shell with comprehensive completion"
DESCRIPTION = "Zsh is a UNIX command interpreter (shell) that resembles the Korn shell \
(ksh). It is not completely compatible. It includes many enhancements, \
notably in the command-line editor, options for customizing its \
behavior, file name globbing, features to make C-shell (csh) users feel \
at home, and extra features drawn from tcsh (another `custom' shell). \
Zsh is well known for its command line completion."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-5.9-5.4.aarch64.rpm"
RPM_HASH = "fb0cf1ecd73b801c4d8e87ae56a313100e6d7410c411bdafa218116cea3b3060e339aad59ea261546a3f62353a8e805b23ee5a0c562b7244a23d0f44cad05375"

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
