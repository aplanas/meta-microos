SUMMARY = "A smarter cd command"
DESCRIPTION = "zoxide is a smarter cd command, inspired by z and autojump. It remembers \
which directories you use most frequently, so you can 'jump' to them in \
just a few keystrokes."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "zoxide-0.9.2-1.1.aarch64.rpm"
RPM_HASH = "7f42a5765e0b1c09a3021c41608b44d5c196ca411b17d36b15344de087774486e5d5855329169f76fa07222c3035c2cd2c0aeb84bc0dfe03f402192f94d291d5"

RPROVIDES:${PN} += "zoxide"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
