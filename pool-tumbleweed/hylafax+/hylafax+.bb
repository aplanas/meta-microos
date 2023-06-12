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

RPROVIDES:${PN} += "config(hylafax+) \
hylafax \
hylafax+ \
hylafax+(aarch-64) \
libfaxserver.so.7.0.7()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
gawk \
ghostscript \
ghostscript-fonts \
group(uucp) \
hylafax+-client \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libfaxutil.so.7.0.7()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjbig.so.2()(64bit) \
liblcms2.so.2()(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit) \
mailx \
sharutils \
systemd \
tiff \
user(uucp)"

inherit rpm
