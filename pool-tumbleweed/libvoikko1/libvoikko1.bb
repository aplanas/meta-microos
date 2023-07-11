SUMMARY = "Library of free natural language processing tools"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
The library supports multiple backends, of which VFST and HFST are \
enabled in the default build: \
 \
 - VFST: Finite state transducer format used for Finnish morphology \
   and as an experimental language independent backend. \
 - HFST (Helsinki Finite-State Transducer Technology): Supports ZHFST \
   speller archives for various languages. \
 - Experimental backends: Weighted VFST and Lttoolbox. \
 \
Libvoikko provides spell checking, hyphenation, grammar checking and \
morphological analysis for Finnish language. Spell checking is \
supported for other languages through the HFST backend."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "libvoikko1-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "7f0eaf014e81e8d2818df4bff9198af91346881ef9f12432045617b430a0f4ab3ac617db883298e7a853c7980de0d8ab906885840095b46612dc6c666f650dd6"

RPROVIDES:${PN} += "libvoikko.so.1 \
libvoikko1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhfstospell.so.11 \
libstdc++.so.6 \
malaga-suomi"

inherit rpm
