SUMMARY = "Faster implementation of HTTP::Headers"
DESCRIPTION = "HTTP::Headers::Fast is a perl class for parsing/writing HTTP headers. \
 \
The interface is same as HTTP::Headers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-HTTP-Headers-Fast-0.22-1.17.noarch.rpm"
RPM_HASH = "e7298b4a77f5cdc5e3031cd4e13eb1a93784b73888a7c232fcac4689785ca50ec8ad34158aa2a680fcf8477bbca97be425fc49316eeee7522c688878905ab5c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Headers--Fast \
perl-HTTP-Headers-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Date"

inherit rpm
