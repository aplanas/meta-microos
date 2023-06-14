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

PV = "3.11.3"

RPM_NAME = "python311-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "d7c7704c2ecfde9fab8ebb959e46f55bc7aad19c71950f52096eb50f3ac1de2528ee7a024a2b28ef7eccef3b78039ee38420fb50db346c1e7dc54f3e88ce4bed"

RPROVIDES:${PN} += "python311 \
python311-readline \
python311-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python311-base"

inherit rpm
