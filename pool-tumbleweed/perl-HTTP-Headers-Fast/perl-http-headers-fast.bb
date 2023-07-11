SUMMARY = "Faster implementation of HTTP::Headers"
DESCRIPTION = "HTTP::Headers::Fast is a perl class for parsing/writing HTTP headers. \
 \
The interface is same as HTTP::Headers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-HTTP-Headers-Fast-0.22-1.16.noarch.rpm"
RPM_HASH = "6ab218978be6764ad854e29166d00ae17c522c213dead6fc5f7aaac0ccccce1de957f2f9befab41bc46938887914d4ab8827dbf43e60c5a05f39a91277ce8068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Headers--Fast \
perl-HTTP-Headers-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Date"

inherit rpm
