SUMMARY = "HTTP Copying and Mirroring Tool"
DESCRIPTION = "w3mir's main focus is to create and maintain a browsable copy of one or \
several remote World Wide Web sites. \
 \
Used to its full potential, w3mir can retrieve the contents of several \
related sites and leave the mirror browseable via a local web server or \
from a file system, such as directly from a CD-ROM. \
 \
w3mir's goal is to be able to make useful mirrors of any reasonable \
World Wide Web site. It specifically preserves link integrity within \
the mirrored documents as well as the integrity of links outside the \
mirror, if you want it to. w3mir has a powerful 'multi scope' mechanism \
enabling the user to make mirrors of several related sites and have \
links between them refer to the mirrored documents rather than the \
original site. w3mir has several features directed at getting mirrors \
for CD-ROM burning and the handling of some rare problems when \
mirroring."
LICENSE = "Artistic-1.0"

PV = "1.0.10"

RPM_NAME = "w3mir-1.0.10-682.28.noarch.rpm"
RPM_HASH = "946f9bd1dac37e3192a409d3acaac775d8985fd715dd1329460b8b4fe2d07d834be4fe17cf4b643fb6c0d599364e8a7d4113b3d73b61760e6d0288d06421f370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-htmlop \
perl-w3http \
perl-w3pdfuri \
w3mir"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-HTML-Parser \
perl-URI \
perl-libwww-perl"

inherit rpm
