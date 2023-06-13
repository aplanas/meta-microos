SUMMARY = "Command Line Interface to WWW Search Engines"
DESCRIPTION = "Surfraw provides a Unix command line interface to a variety of \
WWW search engines and other artifacts of information and makes \
them available as extensions to the shell. \
Surfraw abstracts the browser away from input. Interpretation of \
linguistic forms is handed back to the shell."
LICENSE = "SUSE-Public-Domain"

PV = "2.3.0"

RPM_NAME = "surfraw-2.3.0-3.6.noarch.rpm"
RPM_HASH = "2432b818afa4901e796d085cf0479b28136a6408c8a2709274855ef69b23d5ed634859c4b35116d7156422c2db6387ce38f7461c647ee184bd97bfa637f29eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(surfraw) \
surfraw"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
sed \
w3m \
xdg-utils"

inherit rpm
