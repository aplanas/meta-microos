SUMMARY = "Provides an interface for RFC 2253 style DN strings"
DESCRIPTION = "X500::DN Provides a pure perl parser and formatter for RFC 2253 style \
DN strings. \
 \
 \
 \
Authors: \
-------- \
    Robert Joop <yaph-020416@timesink.de>"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.29"

RPM_NAME = "perl-X500-DN-0.29-109.16.aarch64.rpm"
RPM_HASH = "59c32a2d015d828644d03482481c9bf35c6191a28accba7315ba1b7afd32f6475d7420a574605f0990c77a390d8831bdbd5bcba7274d99eca794a17d9f806f81"

RPROVIDES:${PN} += "perl-X500--DN \
perl-X500--RDN \
perl-X500-DN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Parse-RecDescent"

inherit rpm
