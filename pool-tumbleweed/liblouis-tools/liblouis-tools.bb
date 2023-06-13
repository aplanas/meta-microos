SUMMARY = "Tools from the liblouis braille translator package"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation."
LICENSE = "GPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-tools-3.25.0-1.1.aarch64.rpm"
RPM_HASH = "d4ec5bfd5b867575e94cee7bf5ad296de13e92eff82ef89425624f551b2a1d0e49615440d699a682ff23d7432d68256b2ebf7b6851874bd3e780eb27898d98be"

RPROVIDES:${PN} += "liblouis-tools \
liblouis-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblouis.so.20()(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
