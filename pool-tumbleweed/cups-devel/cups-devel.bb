SUMMARY = "Development Environment for CUPS"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains the header files for developing applications \
that want to make use of libcups for adding print support."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-devel-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "aa7fb74990cdf6257ec6e089164806d604101795094295aea2ff17660af1dc8e1408974e9e1fd190796fed60c9e61cd6c519daa5798ba12fdb437811bcf95a3a"

RPROVIDES:${PN} += "cups-devel \
cups-devel(aarch-64) \
pkgconfig(cups)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups-rpm-helper \
glibc-devel \
libcups2 \
libcupsimage2 \
pkgconfig(avahi-client) \
pkgconfig(gnutls)"

inherit rpm
