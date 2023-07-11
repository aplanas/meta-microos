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

RPM_NAME = "python310-3.10.12-1.1.aarch64.rpm"
RPM_HASH = "57e7972c852f97a6f2d4b62a6e98792f9f17009279ceacfb82964729ce96eef499962f195545ebd7ef24299a683d26f205318fa842d58ec99397bf3acd410396"

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
