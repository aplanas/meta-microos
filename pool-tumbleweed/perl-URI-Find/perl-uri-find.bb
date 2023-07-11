SUMMARY = "Find URIs in arbitrary text"
DESCRIPTION = "This module does one thing: Finds URIs and URLs in plain text. It finds \
them quickly and it finds them *all* (or what URI.pm considers a URI to \
be.) It only finds URIs which include a scheme (http:// or the like), for \
something a bit less strict have a look at URI::Find::Schemeless. \
 \
For a command-line interface, urifind is provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "20160806"

RPM_NAME = "perl-URI-Find-20160806-1.23.noarch.rpm"
RPM_HASH = "370dc3841e470d881702569dec335a82a88eee53c7fc511ccf6df272a63edfaba62477182b83b9440b0d9fd2133de6c6e22aed41d6115bd5af94219e728dc095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Find \
perl-URI--Find--Schemeless \
perl-URI-Find"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-URI"

inherit rpm
