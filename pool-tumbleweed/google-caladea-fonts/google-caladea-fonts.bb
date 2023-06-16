SUMMARY = "Sans-serif Font Metrics-compatible with Cambria"
DESCRIPTION = "Workhorse serif font that is designed to be a metrics-compatible drop-in \
replacement for Cambria. \
Contains Regular, Bold, Italic, and Bold Italic version. \
 \
Designed by Huerta Típografica for Google."
LICENSE = "Apache-2.0"

PV = "1.002"

RPM_NAME = "google-caladea-fonts-1.002-3.17.noarch.rpm"
RPM_HASH = "912c6940e0483fdd5642f177f5130a1f782364862db9b0a17ac8984988f73a0ce985b239dbfbcad1fc8acd282c3630750eac2291f13bad9a5d8526f92b5745be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-caladea-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
