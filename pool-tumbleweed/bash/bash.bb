SUMMARY = "The GNU Bourne-Again Shell"
DESCRIPTION = "Bash is an sh-compatible command interpreter that executes commands \
read from standard input or from a file.  Bash incorporates useful \
features from the Korn and C shells (ksh and csh).  Bash is intended to \
be a conformant implementation of the IEEE Posix Shell and Tools \
specification (IEEE Working Group 1003.2)."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-5.2.15-8.6.aarch64.rpm"
RPM_HASH = "52598690426d81cc7d1fc9433598587d4da4bd7d5af6c1b93c90bdbb31f2cdfd23694295f8fea73e01e112b204cfe6417b9d9aeb4ea7c0eec5c266722fc34c1f"

RPROVIDES:${PN} += "/usr/bin/bash \
bash \
config-bash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libreadline8"

inherit rpm
