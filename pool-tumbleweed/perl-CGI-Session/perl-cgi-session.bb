SUMMARY = "Persistent Session Data in Cgi Applications"
DESCRIPTION = "CGI::Session provides an easy, reliable and modular session management \
system across HTTP requests."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "4.48"

RPM_NAME = "perl-CGI-Session-4.48-15.24.noarch.rpm"
RPM_HASH = "fd7a8817b369941316a23f196eba1f05ca95f6b93bf41397eb25f2c06de0845a4f856caad965f3fbcf9a80220d48ec0943b62f06137fb7d882ef35e9d7e86512"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CGI"

inherit rpm
