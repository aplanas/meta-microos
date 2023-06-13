SUMMARY = "Plain text note-taking assistant for markdown"
DESCRIPTION = "Zk is a plain text note-taking assistant for markdown. \
It is a command-line tool helping you to maintain a plain text Zettelkasten or personal wiki."
LICENSE = "BSD-2-Clause"

PV = "0.13.0"

RPM_NAME = "zk-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "847513b02cb644454ea649736d6992d83f42c5dc6acebca3ddb0343f4d7f45741c7247e38dea464728107c1eab49fdfae7871d18bbafb95a609e7db7d054264c"

RPROVIDES:${PN} += "zk \
zk(aarch-64)"

RDEPENDS:${PN} += "fzf \
libc.so.6(GLIBC_2.34)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
