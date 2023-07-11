SUMMARY = "A Spell Checker"
DESCRIPTION = "Ispell is a fast, screen-oriented spell checker that shows you your \
errors in the context of the original file and suggests possible \
corrections when it can figure them out.  Compared to UNIX spell, it is \
faster and much easier to use.	Ispell can also handle languages other \
than English.  Ispell has a long history and many people have \
contributed to the current version--some of the major contributors \
include R. E. Gorin, Pace Willisson, Walt Buehring, and Geoff Kuenning. \
 \
You can find a short description in the directory \
/usr/share/doc/packages/ispell/. \
 \
 \
 \
Authors: \
-------- \
    R. E. Gorin \
    Pace Willisson <pace@ai.mit.edu> \
    Walt Buehring \
    Goeff Kuenning <geoff@ITcorp.com>"
LICENSE = "BSD-3-Clause"

PV = "3.4.05"

RPM_NAME = "ispell-3.4.05-1.4.aarch64.rpm"
RPM_HASH = "fb53f8d22d856955f3f708a6d507eaad9d61210fa440ea32b6bad037ee15678d974046588f57a292b3ac247e59cd19f1419c851775f3c104c38ab34f76ff6f4e"

RPROVIDES:${PN} += "ispell \
spell"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ispell-dictionary \
ispell-english-dictionary \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
words"

inherit rpm
