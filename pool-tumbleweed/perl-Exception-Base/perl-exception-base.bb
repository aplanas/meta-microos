SUMMARY = "Lightweight exceptions"
DESCRIPTION = "This class implements a fully OO exception mechanism similar to \
Exception::Class or Class::Throwable. It provides a simple interface \
allowing programmers to declare exception classes. These classes can be \
thrown and caught. Each uncaught exception prints full stack trace if the \
default verbosity is increased for debugging purposes. \
 \
The features of 'Exception::Base': \
 \
  * fast implementation of the exception class \
 \
  * fully OO without closures and source code filtering \
 \
  * does not mess with '$SIG{__DIE__}' and '$SIG{__WARN__}' \
 \
  * no external run-time modules dependencies, requires core Perl modules only \
 \
  * the default behavior of exception class can be changed globally or just for \
the thrown exception \
 \
  * matching the exception by class, message or other attributes \
 \
  * matching with string, regex or closure function \
 \
  * creating automatically the derived exception classes (perlfunc/use \
interface) \
 \
  * easily expendable, see Exception::System class for example \
 \
  * prints just an error message or dumps full stack trace \
 \
  * can propagate (rethrow) an exception \
 \
  * can ignore some packages for stack trace output \
 \
  * some defaults (i.e. verbosity) can be different for different exceptions"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.2501"

RPM_NAME = "perl-Exception-Base-0.2501-1.24.noarch.rpm"
RPM_HASH = "78c67d549bfabb16a5d43fde7372ee25dc9c2ee32475a4c9fb7a3bec4f361b1522300225653e9d9c5b7b915f5aa7c223dbb3377bacad61ba2b35a424fcf41cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Base \
perl-Exception-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
