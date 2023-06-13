SUMMARY = "Command-line tool to download MP3 files from Amazon"
DESCRIPTION = "Clamz is a little command-line program to download MP3 files from \
Amazon.com's music store. It is intended to serve as a substitute \
for Amazon's official MP3 Downloader, which is not free software. \
Clamz can be used to download either individual songs or complete \
albums that you have purchased from Amazon."
LICENSE = "GPL-3.0+"

PV = "0.5"

RPM_NAME = "clamz-0.5-11.28.aarch64.rpm"
RPM_HASH = "1481328e25ca7658330ccd27d2f53e51afc25ee0a0c672702398a2021183c3c98e9975cc694e463d732f782b5d8c847bc4947153279ac01096ecd11f74c72112"

RPROVIDES:${PN} += "application() \
application(clamz.desktop) \
clamz \
clamz(aarch-64) \
mimehandler(audio/x-amzxml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit)"

inherit rpm
