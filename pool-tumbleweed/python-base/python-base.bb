SUMMARY = "Python Interpreter base package"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains all of stand-alone Python files, minus binary \
modules that would pull in extra dependencies."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-base-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "0d55eb8bb74477d61a69d8903812198ddaf803ae41fb1bd286a17273669ce4d7e1dde584039d501a50db07729b3bd4173ae7bf92d1cdf3b86a34ad40074a1c1b"

RPROVIDES:${PN} += "python-abi \
python-argparse \
python-base \
python-ctypes \
python2-argparse \
python2-base \
rpm-macro-have-python2 \
rpm-macro-py-compile \
rpm-macro-py-incdir \
rpm-macro-py-libdir \
rpm-macro-py-prefix \
rpm-macro-py-requires \
rpm-macro-py-sitedir \
rpm-macro-python2-package-prefix"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libffi.so.8 \
libm.so.6 \
libpython2-7-1-0 \
libpython2.7.so.1.0 \
libz.so.1"

inherit rpm
