SUMMARY = "Object-oriented CGI interface compliant to CGI.pm"
DESCRIPTION = "CGI::Simple provides a relatively lightweight drop in replacement for \
CGI.pm. It shares an identical OO interface to CGI.pm for parameter \
parsing, file upload, cookie handling and header generation. This module is \
entirely object oriented, however a complete functional interface is \
available by using the CGI::Simple::Standard module. \
 \
Essentially everything in CGI.pm that relates to the CGI (not HTML) side of \
things is available. There are even a few new methods and additions to old \
ones! If you are interested in what has gone on under the hood see the \
Compatibility with CGI.pm section at the end. \
 \
In practical testing this module loads and runs about twice as fast as \
CGI.pm depending on the precise task."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.280"

RPM_NAME = "perl-CGI-Simple-1.280-1.8.noarch.rpm"
RPM_HASH = "136aea498e2d865fb20999e6f23af4ac8618c5111ac6b5f8bd443abb9dcca9609bdb0818882b7f2e3f2c046773669e90e92342f91486680f500234ae2201c7c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--Simple \
perl-CGI--Simple--Cookie \
perl-CGI--Simple--Standard \
perl-CGI--Simple--Util \
perl-CGI-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
