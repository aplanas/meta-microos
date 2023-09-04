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

RPM_NAME = "perl-CGI-4.57-1.3.noarch.rpm"
RPM_HASH = "319a31828d9f6a659ff76323b145324c30a6cf99fa0e4c83c1e494fb32e965c0259caf4c8f77dcdc04895be491db0cce4bede1931d9ec2951b698a0a8d639493"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Temp \
perl-HTML--Entities \
perl-parent"

inherit rpm
