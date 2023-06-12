SUMMARY = "Linux  Manual Pages"
DESCRIPTION = "A large collection of man pages (documentation) from the Linux \
Documentation Project (LDP).  The man pages are organized into the \
following sections: Section 1, user commands (intro only); Section 2, \
system calls; Section 3, libc calls; Section 4, devices (e.g., hd, sd); \
Section 5, file formats and protocols (e.g., wtmp, /etc/passwd, nfs); \
Section 6, games (intro only); Section 7, conventions, macro packages, \
etc. (e.g., nroff, ascii); and Section 8, system administration (intro \
only)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "6.04"

RPM_NAME = "man-pages-6.04-1.1.noarch.rpm"
RPM_HASH = "2544f6f1b6df20b4d2ad2186378a021502d98e0a7a42f259d81e2bce8b2430e3f70ac7328a26c276d82e9118c189f3660891aeddf8e41a1c1aa8acf32595be58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pages"
RDEPENDS:${PN} += ""

inherit rpm
