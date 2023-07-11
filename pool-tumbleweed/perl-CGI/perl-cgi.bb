SUMMARY = "Handle Common Gateway Interface requests and responses"
DESCRIPTION = "CGI.pm is a stable, complete and mature solution for processing and \
preparing HTTP requests and responses. Major features including processing \
form submissions, file uploads, reading and writing cookies, query string \
generation and manipulation, and processing and preparing HTTP headers. \
 \
CGI.pm performs very well in a vanilla CGI.pm environment and also comes \
with built-in support for mod_perl and mod_perl2 as well as FastCGI. \
 \
It has the benefit of having developed and refined over 20 years with input \
from dozens of contributors and being deployed on thousands of websites. \
CGI.pm was included in the perl distribution from perl v5.4 to v5.20, \
however is has now been removed from the perl core..."
LICENSE = "Artistic-2.0"

PV = "4.57"

RPM_NAME = "perl-CGI-4.57-1.2.noarch.rpm"
RPM_HASH = "27354320662bda8b1e9f18b4b7cc090bfe72d34080720c7de01f40c37d9159da9b220365d538d4c4e87a86560724a06fe3972c68a8b0f9afde65131ff18469c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI \
perl-CGI--Carp \
perl-CGI--Cookie \
perl-CGI--File--Temp \
perl-CGI--HTML--Functions \
perl-CGI--MultipartBuffer \
perl-CGI--Pretty \
perl-CGI--Push \
perl-CGI--Util \
perl-Fh"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Temp \
perl-HTML--Entities \
perl-parent"

inherit rpm
