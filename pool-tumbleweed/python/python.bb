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

RPM_NAME = "python-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "bffb6bb9115e2b87ee73a1f765288be9bd079912565ed83c55b42a3d5a5958101e26569efe06023184a191068672fee91f0e4e6e4980b409f05b241ca41ea6df"

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
