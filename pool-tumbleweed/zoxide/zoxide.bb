SUMMARY = "A smarter cd command"
DESCRIPTION = "zoxide is a smarter cd command, inspired by z and autojump. It remembers \
which directories you use most frequently, so you can 'jump' to them in \
just a few keystrokes."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "zoxide-0.9.1-1.2.aarch64.rpm"
RPM_HASH = "ada2ffcfc5ec5c3380ee3deeaf5b6224cdb41e7c609b0ef7810ccf9b6d0ab205cfa7610865b8e8d89d46bb0bb8aa12189554820f43830015f2c589fe32680e5c"

RPROVIDES:${PN} += "zoxide"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
