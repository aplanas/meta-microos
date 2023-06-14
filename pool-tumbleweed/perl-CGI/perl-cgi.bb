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

RPM_NAME = "perl-CGI-4.57-1.1.noarch.rpm"
RPM_HASH = "9bbbaac6d808ba6c4571b28d1d567859bb867da392efe71806787707ed1293c715f9888be971461103bc474c16eeb86d7367ff48d0086cbfea2a07bf58f60d77"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--Temp \
perl-HTML--Entities \
perl-parent"

inherit rpm
