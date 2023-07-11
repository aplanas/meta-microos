SUMMARY = "WebDAV client library for Perl5"
DESCRIPTION = "HTTP::DAV is a Perl API for interacting with and modifying content on \
webservers using the WebDAV protocol. Now you can LOCK, DELETE and PUT \
files and much more on a DAV-enabled webserver."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.49"

RPM_NAME = "perl-HTTP-DAV-0.49-1.18.noarch.rpm"
RPM_HASH = "aa197c044f8dafe81e0b531830f334b1c7e147358287547081492b1d9847a8389ec2d1076ecd82c147208f7022d50ddfbbda6b705d2f924758e1cd83c9f4728e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--DAV \
perl-HTTP--DAV--Comms \
perl-HTTP--DAV--Headers \
perl-HTTP--DAV--Lock \
perl-HTTP--DAV--Resource \
perl-HTTP--DAV--ResourceList \
perl-HTTP--DAV--Response \
perl-HTTP--DAV--UserAgent \
perl-HTTP--DAV--Utils \
perl-HTTP-DAV"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-LWP \
perl-URI \
perl-URI--Escape \
perl-XML--DOM"

inherit rpm
