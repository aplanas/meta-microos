SUMMARY = "C++ library for creating secure and fair online card games"
DESCRIPTION = "LibTMCG is a C++ library for creating secure and fair online card \
games. The library contains classes, algorithms, and high-level \
protocols to support an application programmer in writing such \
software. Neither a trusted third party (TTP), i.e. a central game \
server, nor trusted hardware components are necessary. With the \
library, there is no need for an independent referee, because the \
applied protocols provide a basic level of confidentiality and \
fairness by itself. The library is suited for peer-to-peer (P2P) \
environments where no TTP is available. \
 \
It cannot be avoided that malicious players share information about \
their private cards, but the protocols ensure that the shuffle of the \
deck is performed randomly (presumed that at least one player is \
honest) and thus the cards will be distributed uniformly among the \
players. Further, no coalition can learn the private cards of a \
player against his will (except for trivial conclusions). The \
corresponding cryptographic problemis called Mental Poker, and \
LibTMCG provides an implementation of such protocols. \
 \
The implementation relies on cryptographic techniques---the so-called \
zero-knowledge proofs. Using these building blocks, the high-level \
protocols minimize the effect of coalitions and preserve the \
confidentiality of the players' strategy, i.e. the players are not \
required to reveal their cards at the end of the game to show that \
they did not cheat."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.18"

RPM_NAME = "libTMCG18-1.3.18-1.18.aarch64.rpm"
RPM_HASH = "8265b6be1c842d3a9bb436355e13671c20b724fc351bb0f185e5a9f367ee09f3a1db15952f5c9dcb71fa43754b4423137cd791e78550d329083635ea5fa95d61"

RPROVIDES:${PN} += "libTMCG.so.18 \
libTMCG18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
