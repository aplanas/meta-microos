SUMMARY = "Intelligent predictive text entry platform (shared library)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
A predictive text entry system attempts to improve the ease and speed of textual input by predicting words. Word prediction consists in computing which word tokens or word completions are most likely to be entered next. The system analyses the text already entered and combines the information thus extracted with other information sources to calculate the set of most probable tokens. \
 \
Presage exploits redundant information embedded in natural languages to generate word predictions. The modular architecture allows its language model to be extended and customized to utilize statistical, syntactic, and semantic information sources. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage1-0.9.1-13.2.aarch64.rpm"
RPM_HASH = "455030f236a7c8dc908e8109b562848997c50c93150fdc24566d0f0ef4b45a0f9e9cf1aef543c99c34a033bcdacd8ba43a885b3419441c4e78a827953cc77fc8"

RPROVIDES:${PN} += "libpresage.so.1 \
libpresage1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
presage-data"

inherit rpm
