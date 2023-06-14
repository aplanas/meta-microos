SUMMARY = "Tamil-Brahmi font"
DESCRIPTION = "Adinatha is a  working Unicode Tamil Brahmi font."
LICENSE = "OFL-1.1"

PV = "1.0"

RPM_NAME = "adinatha-fonts-1.0-3.17.noarch.rpm"
RPM_HASH = "da4764c83c20adef737d7d329ad8c24deb1db9c7a1cfb2657176e7f63b0c054e112f2326fd161430feb415648eefe7f78f0787a57893d2314e1c1fa0ae8b4bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adinatha-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
