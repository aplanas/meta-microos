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

PV = "3.11.4"

RPM_NAME = "python311-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "9024fdc2d8df95df0d44b8851dd713b1ccb154e7b14f4f1c47e233bef5122a07db6b57602fac57a8423f5e2f566bde64ec1a1f223ceaf7d17ebb6c355217ac2b"

RPROVIDES:${PN} += "python3 \
python3-readline \
python3-sqlite3 \
python311 \
python311-readline \
python311-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python311-base"

inherit rpm
