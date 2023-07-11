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

RPM_NAME = "python311-pyScss-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "ff8eaf655df7fb2b6a17ae65c3a12ee6c95224caf2a81d7065d42625c59893f7b073d13e8f4724eb00dd99e7a461996afc5e63f710d52afa4392ac7599fe8c9e"

RPROVIDES:${PN} += "python3-pyScss \
python3.11dist-pyscss \
python311-pyScss \
python3dist-pyscss"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre.so.1 \
python-abi \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
