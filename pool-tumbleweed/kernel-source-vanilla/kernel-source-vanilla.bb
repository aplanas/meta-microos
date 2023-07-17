SUMMARY = "Vanilla Linux kernel sources with minor build fixes"
DESCRIPTION = "Vanilla Linux kernel sources with minor build fixes. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-source-vanilla-6.4.2-1.1.noarch.rpm"
RPM_HASH = "1d0da731b191701ed30130b6988663e1053758b8f05b10bda9154343571e025b260c82f1b71912baee1cc789507308b4e93036354f9d3ed118acdf2063ee2ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-vanilla \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-macros"

inherit rpm
