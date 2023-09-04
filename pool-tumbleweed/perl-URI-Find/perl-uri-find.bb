SUMMARY = "Find URIs in arbitrary text"
DESCRIPTION = "This module does one thing: Finds URIs and URLs in plain text. It finds \
them quickly and it finds them *all* (or what URI.pm considers a URI to \
be.) It only finds URIs which include a scheme (http:// or the like), for \
something a bit less strict have a look at URI::Find::Schemeless. \
 \
For a command-line interface, urifind is provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "20160806"

RPM_NAME = "perl-URI-Find-20160806-1.24.noarch.rpm"
RPM_HASH = "fee4a6698642b8b42845c849bbdb9e4ed5c1b6ebd73d0ef42dc06ece04d4ba5ec2fbb152b9502b2c3d6fc6303eb0f58b97ac329bcd85b85b32e0344fb4019296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Find \
perl-URI--Find--Schemeless \
perl-URI-Find"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-URI"

inherit rpm
