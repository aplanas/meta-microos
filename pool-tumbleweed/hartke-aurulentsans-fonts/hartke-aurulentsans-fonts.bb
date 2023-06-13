SUMMARY = "A Sans-Serif Font for Use as Primary Interface Font"
DESCRIPTION = "Aurulent Sans is a humanist sans serif intended to be used as an \
interface font. The width and style is reminiscent of Luxi Sans, \
Lucida Sans, Tahoma, and Andale Sans UI. Aurulent currently ha \
s four styles: regular, italic, bold, and bold italic. \
 \
Designer: Stephen G. Hartke"
LICENSE = "OFL-1.1"

PV = "20070504"

RPM_NAME = "hartke-aurulentsans-fonts-20070504-7.17.noarch.rpm"
RPM_HASH = "358b2130d95d5e9470bfbf4e3a985597fd7af3212b6acad767becc0795e9a22cc5b7ab92d19c47228ba28ca886d7967ae09ab160278121a1446e105f9a9d2949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hartke-aurulentsans-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
