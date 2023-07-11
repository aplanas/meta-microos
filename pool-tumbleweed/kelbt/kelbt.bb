SUMMARY = "Backtracking LALR(1) parser generator"
DESCRIPTION = "Kelbt generates backtracking LALR(1) parsers. Where traditional \
LALR(1) parser generators require static resolution of shift/reduce \
conflicts, Kelbt generates parsers that handle conflicts by \
backtracking at runtime. Kelbt is able to generate a parser for any \
context-free grammar that is free of hidden left recursion."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "kelbt-0.16-2.12.aarch64.rpm"
RPM_HASH = "f02c0712328ffd9af73317adda8bb61e133dfd935101b9e3b00ee8d15ab0cabb1d974d313798e82ce0f8fc8f915cc6167b8f2d9707084eb696a026894f998bf9"

RPROVIDES:${PN} += "kelbt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
