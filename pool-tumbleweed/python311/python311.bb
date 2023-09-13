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

PV = "3.11.5"

RPM_NAME = "python311-3.11.5-1.1.aarch64.rpm"
RPM_HASH = "eb8452c3a2b6886903bec10c922996a7befaca620b1a622e3989019d2cd4053592a1a526efe95d1c3e1d9dcb78aee73d5514dc6ef577eff444fdbe91cd6e5d8c"

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
