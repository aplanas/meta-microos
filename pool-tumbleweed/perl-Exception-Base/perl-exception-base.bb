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

RPM_NAME = "perl-Exception-Base-0.2501-1.23.noarch.rpm"
RPM_HASH = "3fa451d04627d4fb6d9e39ff4ee321e33bc19562c1aa4155f1e4dc9edaf8f117c7757a9ba52fd1180c6f3f9c6333f754815c472eb77b253695db5c85ae9b3421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Base \
perl-Exception-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
