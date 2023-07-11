SUMMARY = "The Reckless rAcket SHell"
DESCRIPTION = "Rash is a shell language, library, and REPL(Read–Eval–Print-Loop) for Racket. \
 \
Use as a REPL that is as convenient for pipelining programs as Bash is, but \
has all the power of Racket. Use as a scripting language with #lang rash. \
Embed in normal Racket files with (require rash), and mix freely with any \
other Racket language or library. \
 \
Rash is in active development, but it is largely stable (and the parts that \
are not are marked as such). It can be used as an interactive shell.  It \
currently lacks the interactive polish of Zsh or Fish, but it is so much \
better as a language."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "rash-0.2-3.5.aarch64.rpm"
RPM_HASH = "e9c9e8693939264a177171eefe91f0ac5544ac915ddf0490d29e42395df120a45840f79549ad1a8c1b464ff4f8e22d9e8ced0f04635974dcefabbdda12ddf724"

RPROVIDES:${PN} += "rash"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libedit0 \
libsqlite3-0 \
racket"

inherit rpm
