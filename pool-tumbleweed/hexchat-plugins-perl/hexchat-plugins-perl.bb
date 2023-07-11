SUMMARY = "Plugin for HexChat adds support for Perl scripts"
DESCRIPTION = "The HexChat plugin providing the Perl scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-perl-2.16.1-2.7.aarch64.rpm"
RPM_HASH = "d0cfbb2c943d8bb5ef2ded6b84c30363160795196bc1aec6b6242faaabb492fc6cd275474b1f97b0888a078a8bb5c2f9507326b5b2478e920a11d13885c3fb09"

RPROVIDES:${PN} += "hexchat-plugins-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libperl.so \
perl"

inherit rpm
