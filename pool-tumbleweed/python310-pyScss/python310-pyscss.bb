SUMMARY = "pyScss, a Scss compiler for Python"
DESCRIPTION = "pyScss is a compiler for SCSS flavor of the Sass language, a superset of CSS3 \
that adds programming capabilities and some other syntactic sugar. \
 \
95% of Sass 3.2 is supported.  If it's not supported, it's a bug!  Please file \
a ticket. \
 \
Most of Compass 0.11 is also built in. \
 \
Documentation: \
http://pyscss.readthedocs.org/en/latest/ \
 \
The canonical syntax reference is part of the Ruby Sass documentation: \
http://sass-lang.com/docs/yardoc/file.SASS_REFERENCE.html"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-pyScss-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "116706a5f0e1a4a273d6ef0e7f021173474d37fca2f634a2372d65fafbdf9837ad44e9dece21589cc428f76edbdbdf744bca2a0eeb54d23118282d9d25ca41da"

RPROVIDES:${PN} += "python3.10dist-pyscss \
python310-pyScss \
python3dist-pyscss"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre.so.1 \
python-abi \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
