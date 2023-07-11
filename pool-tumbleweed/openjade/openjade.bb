SUMMARY = "DSSSL Engine for SGML Documents"
DESCRIPTION = "OpenJade, the follow-up to Jade by James Clark, is an implementation of \
the ISO/IEC 10179:1996 standard DSSSL (Document Style, Semantics, and \
Specification Language); pronounce it 'dissl'--it rhymes with whistle. \
 \
It has back-ends for SGML, RTF, MIF, TeX, and HTML. \
 \
The parser, 'nsgmls,' and helper tools like 'sgmlnorm,' 'spam,' \
'spent,' and 'sx' are now included in the separate 'opensp' package."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "openjade-1.3.2-373.8.aarch64.rpm"
RPM_HASH = "80a7c38eb82316bca0aff86a9dcdd2c3a729022f689ec071dd06db19a3be2cfe3b0585e1b3aa702a9c7966278276d890c67be428c24ef64ab081448176481c5d"

RPROVIDES:${PN} += "config-openjade \
jade \
jade-dsl \
libogrove.so.0 \
libospgrove.so.0 \
libostyle.so.0 \
openjade"

RDEPENDS:${PN} += "/usr/bin/sgml-register-catalog \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libosp.so.5 \
libstdc++.so.6 \
opensp"

inherit rpm
