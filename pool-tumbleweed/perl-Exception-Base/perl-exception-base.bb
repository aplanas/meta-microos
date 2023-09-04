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
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.2501"

RPM_NAME = "perl-Exception-Base-0.2501-2.1.noarch.rpm"
RPM_HASH = "5a6d86597a3b158e4a6f92ced3a42cc32312949798b27efca90766f5dd64cca5833a299889df5d5d9be8c125aa53b44f1964ea7490b0002e7d6f4b4ceccb2490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Base \
perl-Exception-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
