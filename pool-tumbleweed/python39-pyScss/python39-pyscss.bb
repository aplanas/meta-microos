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

RPM_NAME = "python39-pyScss-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "833809183f89daeed58d1b9b73bbe6751b66525641224374ef699bc6888808403234c0a954b6338e7d1cfb6e93f7d1b3e882ea9ff899963094886ab1563e8675"

RPROVIDES:${PN} += "python3.9dist-pyscss \
python39-pyScss \
python3dist-pyscss"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre.so.1 \
python-abi \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
