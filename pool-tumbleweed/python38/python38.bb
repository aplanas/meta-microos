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

PV = "3.8.18"

RPM_NAME = "python38-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "635ccb18b87c7ba5fcbe8222eb296d4741c278b929b64ffb78b83e2722fe054ec455b5d2b56c999a8c20b9447bb0d12332310124b5e1f92b5043c9ce73435220"

RPROVIDES:${PN} += "python38 \
python38-readline \
python38-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python38-base"

inherit rpm
