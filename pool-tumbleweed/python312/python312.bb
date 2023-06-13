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

PV = "3.12.0b1"

RPM_NAME = "python312-3.12.0b1-1.1.aarch64.rpm"
RPM_HASH = "1f47faa03011981af239341c3b73e2902d94d9d7655c595f90bb5ade4d6ff76fec47a6ffac8882e58695259779eef3841508b859dc1ef61c0d8a52ba397eae26"

RPROVIDES:${PN} += "python312 \
python312(aarch-64) \
python312-readline \
python312-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit) \
libsqlite3.so.0()(64bit) \
python(abi) \
python312-base"

inherit rpm
