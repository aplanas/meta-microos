SUMMARY = "Plain text note-taking assistant for markdown"
DESCRIPTION = "Zk is a plain text note-taking assistant for markdown. \
It is a command-line tool helping you to maintain a plain text Zettelkasten or personal wiki."
LICENSE = "BSD-2-Clause"

PV = "0.14.0"

RPM_NAME = "zk-0.14.0-2.1.aarch64.rpm"
RPM_HASH = "91b4a0bb4f95dc07095566ac5b337d5122e0266207e788116399f97074c9a0b7bed3904038322f51963f76b2c92df683cff41f9024eb63fddb6a924666a57072"

RPROVIDES:${PN} += "zk"

RDEPENDS:${PN} += "fzf \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6"

inherit rpm
