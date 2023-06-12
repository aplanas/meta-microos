SUMMARY = "Faster implementation of HTTP::Headers"
DESCRIPTION = "HTTP::Headers::Fast is a perl class for parsing/writing HTTP headers. \
 \
The interface is same as HTTP::Headers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-HTTP-Headers-Fast-0.22-1.15.noarch.rpm"
RPM_HASH = "021fc42d8487c14b48f02180bee275ccc63f44c0e6f2571cf3942e1bcb476ea06229b7eb2d88bf739f40741caf6ab883bd4ae6b68154ec1f68bfbdce45fb21cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Headers::Fast) \
perl-HTTP-Headers-Fast"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTTP::Date)"

inherit rpm
