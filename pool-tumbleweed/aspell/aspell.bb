SUMMARY = "A Spell Checker"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
Its main feature is an improved method for finding possible \
suggestions for the English language, arguably surpassing Ispell and \
Microsoft Word. It also has many other technical enhancements over \
Ispell, such as using shared memory for dictionaries and \
intelligently handling personal dictionaries when more than one \
Aspell process is open at once."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "aspell-0.60.8-5.5.aarch64.rpm"
RPM_HASH = "7f7ebf2bbde0b42c652f447e23b7c96e5472099ef60f5de02af5f28123f7f6503b2c2a0fc131aeb7074d6e5bc268b205fd61af426c3f80179d51bd2e56e98815"

RPROVIDES:${PN} += "aspell \
pspell"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libaspell.so.15 \
libc.so.6 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
