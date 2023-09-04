SUMMARY = "Persistent Session Data in Cgi Applications"
DESCRIPTION = "CGI::Session provides an easy, reliable and modular session management \
system across HTTP requests."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "4.48"

RPM_NAME = "perl-CGI-Session-4.48-15.25.noarch.rpm"
RPM_HASH = "5a3088ecff6b0dfcc03868cea03fb3c255ad64e16eefc2900e6ced85a6c03a0e885e30037a10c24fb9c9aa3599e3fe744b3a46ad33d14e5a2e4277f04ecd1d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--Session \
perl-CGI--Session--Driver \
perl-CGI--Session--Driver--DBI \
perl-CGI--Session--Driver--db-file \
perl-CGI--Session--Driver--file \
perl-CGI--Session--Driver--mysql \
perl-CGI--Session--Driver--postgresql \
perl-CGI--Session--Driver--sqlite \
perl-CGI--Session--ErrorHandler \
perl-CGI--Session--ID--incr \
perl-CGI--Session--ID--md5 \
perl-CGI--Session--ID--static \
perl-CGI--Session--Serialize--default \
perl-CGI--Session--Serialize--freezethaw \
perl-CGI--Session--Serialize--storable \
perl-CGI--Session--Test--Default \
perl-CGI--Session--Test--SimpleObjectClass \
perl-CGI--Session--Tutorial \
perl-CGI-Session \
perl-OverloadedClass"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CGI"

inherit rpm
