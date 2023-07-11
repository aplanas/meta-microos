SUMMARY = "Python Interpreter"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
If you want to install third party modules using distutils, you need to \
install python-devel package."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "40be7685e7f63ee0edc95dfc5026b4f15e2cf3e01c68b975c50a4ad564a1a114e7d72e8fbdc830663823a5dfe3db0fb41cccad9f2f00cd5f8ba717c0fe50da34"

RPROVIDES:${PN} += "python \
python2 \
python2-split-startup"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.1 \
libdb-4.8.so \
libpython2.7.so.1.0 \
libreadline.so.8 \
libsqlite3.so.0 \
libssl.so.1.1 \
python-base"

inherit rpm
