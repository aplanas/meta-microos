SUMMARY = "Ikiwiki w3m cgi meta-wrapper"
DESCRIPTION = "Enable to use all of ikiwiki's web features (page editing, etc) in \
the w3m web browser without using a web server. w3m supports local \
CGI scripts, and ikiwiki can be set up to run that way."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause"

PV = "3.20200202.3"

RPM_NAME = "ikiwiki-w3m-3.20200202.3-2.15.noarch.rpm"
RPM_HASH = "f3d6dc3d725fff66d0cb08cc3316c2a31e06f806e81ec8d78a54b00d0c01eee1501b29b678b94fc7ffee550785ef9403677b4a6b6a9b430e1fc024324bbd7cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ikiwiki-w3m"

RDEPENDS:${PN} += "/usr/bin/perl \
ikiwiki \
w3m"

inherit rpm
