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

RPM_NAME = "python310-pyScss-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "8213757ed08036c5a629857fdad5753b1e3c1f991da7215f3710c38ce91bab01ee34bc5dda8ab52a173c4ea3f92e55929b15583ac7205ef145030d5dc51b5c99"

RPROVIDES:${PN} += "python3-pyScss \
python3.10dist-pyscss \
python310-pyScss \
python3dist-pyscss"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre.so.1 \
python-abi \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
