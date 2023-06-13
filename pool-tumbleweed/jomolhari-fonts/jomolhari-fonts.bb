SUMMARY = "Tibetan Font"
DESCRIPTION = "Created in 2006 by Chris Fynn, Jomolhari is an OpenType Tibetan/Bhutanese font that supports \
both the Unicode encoding for Tibetan and part A of the Chinese encoding for pre-composed \
Tibetan characters. Based on Bhutanese manuscript examples, it is in its preliminary stage \
or alpha version. This version was made for trial purposes, and its author, Chris Fynn, \
welcomes feedback."
LICENSE = "OFL-1.1"

PV = "alpha003"

RPM_NAME = "jomolhari-fonts-alpha003-3.17.noarch.rpm"
RPM_HASH = "1cda1152c892f8cd1b63f2833389588347a67c867b52c1b24fa60043204e97dd5845fbc11c10e191f43533c5aa0fca4cfc51982aae47bf48dfbd1884ddb1c7c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jomolhari-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
