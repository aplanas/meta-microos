SUMMARY = "A fax server"
DESCRIPTION = "HylaFAX is a fax server supporting Class 1 and 2 fax modems on UNIX \
systems. It provides spooling services and numerous supporting fax \
management tools. The fax clients may reside on machines different \
from the server, and client implementations exist for a number of \
platforms, including Windows."
LICENSE = "BSD-3-Clause"

PV = "7.0.7"

RPM_NAME = "hylafax+-7.0.7-1.4.aarch64.rpm"
RPM_HASH = "dfae6cfbe4754f604bee8ef85f6fafd345bd5df8548c0b1a7b4894489ca6c0f3b6103ab5fd65344dbb3315703a46bcb590bf93a91036f92b53f7c3a6107a85d5"

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
