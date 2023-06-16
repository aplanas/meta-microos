SUMMARY = "The GNU Bourne-Again Shell"
DESCRIPTION = "Bash is an sh-compatible command interpreter that executes commands \
read from standard input or from a file.  Bash incorporates useful \
features from the Korn and C shells (ksh and csh).  Bash is intended to \
be a conformant implementation of the IEEE Posix Shell and Tools \
specification (IEEE Working Group 1003.2)."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-5.2.15-8.3.aarch64.rpm"
RPM_HASH = "994afe4e760422a7e37fe25db004bdbe6dd09d8fc78c6cc6cb573913fb64a05f9d358786877ca7ccc04efbeb16d61708c7e4a0baa91a03a531812e33dfd22590"

RPROVIDES:${PN} += "/usr/bin/bash \
bash \
config-bash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libreadline8"

inherit rpm
