SUMMARY = "WebDAV client library for Perl5"
DESCRIPTION = "HTTP::DAV is a Perl API for interacting with and modifying content on \
webservers using the WebDAV protocol. Now you can LOCK, DELETE and PUT \
files and much more on a DAV-enabled webserver."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.49"

RPM_NAME = "perl-HTTP-DAV-0.49-1.19.noarch.rpm"
RPM_HASH = "bfc9e28eeb5f4ef94d0dec11ea953a2e6d3865e962091c74251119a1b74b7a74cde1d75db9ca8cb27a5338656b39c1bda6560e6f3074c1b8a0b08fc0c95addda"
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
perl--MODULE-COMPAT-5.38.0 \
perl-LWP \
perl-URI \
perl-URI--Escape \
perl-XML--DOM"

inherit rpm
