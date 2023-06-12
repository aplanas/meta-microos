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

RPM_NAME = "python-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "4281e3837bfa76f408c71ce45120345a11158cec5607101cddea8ecd3c0d7967b6be3e1c41838a74c9a220cecaa48330765bc7eb840ff7cb9d8bc1ea1b2b67c1"

RPROVIDES:${PN} += "python \
python(aarch-64) \
python2 \
python2_split_startup"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.1.1()(64bit) \
libcrypto.so.1.1(OPENSSL_1_1_0)(64bit) \
libdb-4.8.so()(64bit) \
libpython2.7.so.1.0()(64bit) \
libreadline.so.8()(64bit) \
libreadline.so.8(READLINE_7.0)(64bit) \
libsqlite3.so.0()(64bit) \
libssl.so.1.1()(64bit) \
libssl.so.1.1(OPENSSL_1_1_0)(64bit) \
python-base"

inherit rpm
