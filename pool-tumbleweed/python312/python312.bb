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

PV = "3.12.0rc1"

RPM_NAME = "python312-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "bf29a86fd3a1f73f370f7001bb9b4da4e502cffe22f45662e0aa14a4c4b5a9c64089137542710542e671bc0f65e3005a631118edb72edb55ead340ec9b73901c"

RPROVIDES:${PN} += "python312 \
python312-readline \
python312-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python312-base"

inherit rpm
