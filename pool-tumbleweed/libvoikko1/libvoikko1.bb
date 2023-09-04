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

RPM_NAME = "libvoikko1-4.3.2-2.1.aarch64.rpm"
RPM_HASH = "84b1dc592b1ba2594c4d61e48e8e1e639484ae99b325ed237cc6b8af4fae8eccbe8243cf3d2cf0feff97ca4fc4c4fc1e83f6fd9363b4197f7e26e505408508c8"

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
