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

PV = "3.10.11"

RPM_NAME = "python310-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "ca06747691e0d659e0965794e5773e16d61584e580343f8cf688585723bef3d50c1df5beef1192e203853de05c780284f9928326bab941f1fcf7cb137384fcbe"

RPROVIDES:${PN} += "python3 \
python3-readline \
python3-sqlite3 \
python310 \
python310(aarch-64) \
python310-readline \
python310-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit) \
libsqlite3.so.0()(64bit) \
python(abi) \
python310-base"

inherit rpm
