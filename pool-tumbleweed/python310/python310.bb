SUMMARY = "Python 3 Interpreter"
DESCRIPTION = "Python 3 is modern interpreted, object-oriented programming language, \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python3-doc \
package. \
 \
This package supplies rich command line features provided by readline, \
and sqlite3 support for the interpreter core, thus forming a so called \
'extended' runtime. \
Installing 'python3' is sufficient for the vast majority of usecases. \
In addition, recommended packages provide UI toolkit support (python3-curses, \
python3-tk), legacy UNIX database bindings (python3-dbm), and the IDLE \
development environment (python3-idle)."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "428d935ae7660ae7c34fd39cf9068fd4257e65a5f377c3144c0a073a1a1356b5b67b3a17ea571f1a26926088845a92f678fc044b856d95bf13c1568c6b834213"

RPROVIDES:${PN} += "python310 \
python310-readline \
python310-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python310-base"

inherit rpm
