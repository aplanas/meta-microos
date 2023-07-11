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

RPM_NAME = "python39-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "fbd9da687c14ebf6630cb746cc4ff952ebf3de7ee2045c43c07d635907b431223447817252ee83b55093d6e7e019b1ee92356c2eabc141cc36663b155054791c"

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
