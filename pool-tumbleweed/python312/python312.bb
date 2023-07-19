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

PV = "3.12.0b4"

RPM_NAME = "python312-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "89acfb614fad15a1e54af812d8fe6acf4f636412996ac0012b0714be489aec080284865a153be3fd34bbbece342ecca3c7cd24edd1fce8d479206f76831cd227"

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
