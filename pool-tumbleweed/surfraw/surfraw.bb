SUMMARY = "Command Line Interface to WWW Search Engines"
DESCRIPTION = "Surfraw provides a Unix command line interface to a variety of \
WWW search engines and other artifacts of information and makes \
them available as extensions to the shell. \
Surfraw abstracts the browser away from input. Interpretation of \
linguistic forms is handed back to the shell."
LICENSE = "SUSE-Public-Domain"

PV = "2.3.0"

RPM_NAME = "surfraw-2.3.0-3.7.noarch.rpm"
RPM_HASH = "ca2345ef23c795a9ae8835b66493bc2c2fe88480d39a5ee3bedaf2d4f97b1ed98407846ed59dc24610c384ffe9eec27c1238ee4c27f263a9a0ed19fc8eb1601c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-surfraw \
surfraw"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
sed \
w3m \
xdg-utils"

inherit rpm
