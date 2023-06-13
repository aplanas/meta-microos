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

RPM_NAME = "python311-pyScss-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "dcf0e2ac63b14f3e595f39c1129afdacbb6b8ae12facb3144bb69cc2cdd741864b9076d9c697a6cf54393def3151582f40f8ec223428f031c12d85109864644a"

RPROVIDES:${PN} += "python3.11dist(pyscss) \
python311-pyScss \
python311-pyScss(aarch-64) \
python3dist(pyscss)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcre.so.1()(64bit) \
python(abi) \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
