SUMMARY = "xlogin, xtelnet"
DESCRIPTION = "This package contains two scripts, which, called with the name of a \
remote host, will open an xterm window on the local X display with a \
remote session or login shell. \
 \
The script xlogin starts by a rsh call (remote shell) an xterm on the \
remote host.  If necessary, the access will be allowed by sending the \
magic key (cookie) of the display to the remote host. \
 \
The script xtelnet starts a local xterm with a telnet session on the \
remote host. \
 \
 \
 \
Authors: \
-------- \
    Werner Fink <werner@suse.de>"
LICENSE = "GPL-2.0+"

PV = "0.2"

RPM_NAME = "xlogin-0.2-221.17.noarch.rpm"
RPM_HASH = "0e42741abf91f20c53ef9cfbf9504ce08ac5ad4b23f9ee089d4a5380e1d892f0565cb778a202a1ef91090627febad1bc7aed170f562ec23021a989a01283de15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xlogin"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
textutils"

inherit rpm
