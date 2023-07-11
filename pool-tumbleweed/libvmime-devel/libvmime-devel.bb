SUMMARY = "Development files for vmime, an e-mail message library"
DESCRIPTION = "VMime is a C++ class library for working with RFC5322 and \
MIME-conforming messages (RFC2045–2049), as well as Internet \
messaging services like IMAP, POP or SMTP. \
 \
This subpackage contains the headers for the library's API."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.2.175"

RPM_NAME = "libvmime-devel-0.9.2.175-2.5.aarch64.rpm"
RPM_HASH = "5d6f389566049f3c94015ba2f8bb5575f8d6654e202e478471cee9cee7fe2e68610ba8fa73cb6f3aede6aaef9b0558aa1a72b0a93fabf0779054de98de810708"

RPROVIDES:${PN} += "cmake-vmime \
libvmime-devel \
pkgconfig-vmime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmime-suse5 \
pkgconfig-gnutls \
pkgconfig-libgsasl"

inherit rpm
