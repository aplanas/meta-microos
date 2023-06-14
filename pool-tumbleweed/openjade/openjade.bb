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

RPM_NAME = "openjade-1.3.2-373.7.aarch64.rpm"
RPM_HASH = "9d75eb551eea0f7e87e937730a6f75d88c5adf722aa1d298e2dcf897257585d6aecbcbf37ad83db00173eb8ffd131d51b18d88708e1ede662f8552e780cd6ae9"

RPROVIDES:${PN} += "config-openjade \
jade \
jade-dsl \
libogrove.so.0 \
libospgrove.so.0 \
libostyle.so.0 \
openjade"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sgml-register-catalog \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libosp.so.5 \
libstdc++.so.6 \
opensp"

inherit rpm
