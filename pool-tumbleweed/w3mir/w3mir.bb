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

RPM_NAME = "w3mir-1.0.10-682.27.noarch.rpm"
RPM_HASH = "f7fe57e0ab112fdbc3631917637ca0340fcca1eb6143b8ea659a4616cc5e66ef29ffc967370ad34b63bcc92fdd1e9a3e096a63e5aa518690a7b5c0f8c50a3664"
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
