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

RPM_NAME = "python39-pyScss-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "d03118375c961efeba7f00916b3cae0a68c95fa17449ccdbcf01919cbee54fa443e89dd8b105793bbc4d0046e90858f75465898549a1e0ef9b9ead2da03d9b84"

RPROVIDES:${PN} += "python3.9dist(pyscss) \
python39-pyScss \
python39-pyScss(aarch-64) \
python3dist(pyscss)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcre.so.1()(64bit) \
python(abi) \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
