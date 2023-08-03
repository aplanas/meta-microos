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

PV = "3.9.17"

RPM_NAME = "python39-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "10859bc42eb8cfd8a0ac0054be3e4bfcdfc3e258d44ef098f93e70f2b60f67bfe96c8299bfce8235780a07d84090ec4ebe5e6f6456c86bf6583ad1dadd132638"

RPROVIDES:${PN} += "python39 \
python39-readline \
python39-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python39-base"

inherit rpm
