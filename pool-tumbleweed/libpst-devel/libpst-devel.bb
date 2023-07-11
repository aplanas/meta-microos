SUMMARY = "Development files for libpst, a .pst file reader"
DESCRIPTION = "libpst is a library that can decode the email messages stored in a \
'PST' file as created by Outlook. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libpst."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-devel-0.6.76-1.4.aarch64.rpm"
RPM_HASH = "d3810fce605d01b9745a2553e9b5bc8aab80d6a35fa37269e04713d57c5237a96a86566340a78f0d50b80b883211ca114a5dce888c93740c9476d112d0bcdb8e"

RPROVIDES:${PN} += "libpst-devel \
pkgconfig-libpst"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpst4"

inherit rpm
