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

RPM_NAME = "rash-0.2-3.3.aarch64.rpm"
RPM_HASH = "682ca87e95455f353cac590be361167d8695249bbd44ad45af76e321b4dda3a9c243b97bb79e52cad12ae8ef1c0f9cd379975dfbc919d45e752a29c0f2bd9215"

RPROVIDES:${PN} += "rash"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6 \
libedit0 \
libsqlite3-0 \
racket"

inherit rpm
