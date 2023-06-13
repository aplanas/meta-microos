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

RPM_NAME = "w3mir-1.0.10-682.26.noarch.rpm"
RPM_HASH = "fe3f6e53cf65055500ab502a4502d2690f18baf8332805ad38b60ec4fb5c2fb15326708d6b2b194d102f8a2b7881197c6969b00cc1e9b34068c8f655e206bf66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(htmlop) \
perl(w3http) \
perl(w3pdfuri) \
w3mir"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-HTML-Parser \
perl-URI \
perl-libwww-perl"

inherit rpm
