SUMMARY = "Nine men's morris game"
DESCRIPTION = "Morris is an implementation of the board game 'Nine Men's Morris'. \
Other names for this game are: Mills, Merrills, Morris, or Mühle in \
German. \
This implementation of Nine Men's Morris supports not only the \
standard game, but also several rule-variants and different board \
layouts. You can play against the computer, or simply use the \
program to present the board, but play against another human \
opponent. The computer opponent learns from previous games and \
tries not to make the same mistake twice. \
 \
Among others, the game plays the following variants: \
  * Lasker variant (moves are also allowed in the set-phase) \
  * the Möbius board (invented by Ingo Althöfer) \
  * the Windmill board \
  * Pentagon and Hexagon boards \
  * Morabaraba \
  * Six and Seven Men's Morris \
  * Tapatan, Achi, Nine Holes \
 \
Furthermore, the game supports: \
  * advanced AI controls to tweak AI playing style \
  * giving hints for good moves \
  * showing the principal variation \
  * move takeback (undo and redo) \
  * internationalization (English, German, Chinese) \
  * many board and rule variations, as well as free customization \
    of rules \
  * configurable display"
LICENSE = "GPL-3.0-only"

PV = "0.2"

RPM_NAME = "morris-0.2-1.17.aarch64.rpm"
RPM_HASH = "3becd4b0935b83231ff85b24ac30d3ec45e8fd4f20a790a03cc223ae2b6ef95c718a7d2d5159bcfd93dd8903dbc031ff6f34b638d1689cd3ebbd88b3915c96a5"

RPROVIDES:${PN} += "morris"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
