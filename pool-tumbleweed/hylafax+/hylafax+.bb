SUMMARY = "A fax server"
DESCRIPTION = "HylaFAX is a fax server supporting Class 1 and 2 fax modems on UNIX \
systems. It provides spooling services and numerous supporting fax \
management tools. The fax clients may reside on machines different \
from the server, and client implementations exist for a number of \
platforms, including Windows."
LICENSE = "BSD-3-Clause"

PV = "7.0.7"

RPM_NAME = "hylafax+-7.0.7-1.6.aarch64.rpm"
RPM_HASH = "56f7cd026714d9fc785a5259abf58ca71f314b069f45cdded2f29215ce2c4026905cd2fe1b4833b2b1b9dbdeecb94c2af106b4d20477a444c8a2e89bb1758a20"

RPROVIDES:${PN} += "config-hylafax+ \
hylafax \
hylafax+ \
libfaxserver.so.7.0.7"

RDEPENDS:${PN} += "/usr/bin/sh \
gawk \
ghostscript \
ghostscript-fonts \
group-uucp \
hylafax+-client \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libfaxutil.so.7.0.7 \
libgcc-s.so.1 \
libjbig.so.2 \
liblcms2.so.2 \
libldap.so.2 \
libpam.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1 \
mailx \
sharutils \
systemd \
tiff \
user-uucp"

inherit rpm
