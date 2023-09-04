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

RPM_NAME = "python39-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "758c7cae51c657f95bd31d4c81c3d8ff59a47e4ce1b8c4a6baf83103a1a6f58852047ec82261e5bbfa0563a35092ab678ca5dfedf17789fe328600ae5830fffb"

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
