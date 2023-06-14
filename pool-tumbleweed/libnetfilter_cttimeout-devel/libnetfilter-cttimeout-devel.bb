SUMMARY = "Userspace library for the Netfilter Conntrack Timeout extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended timeout settings infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cttimeout-devel-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "c117ef2b09eafd44908f926b95899b0693700970dc7597ec5c4da702e747b860c5b1c24da34dad6f2c65c8ba4490a7104353cc5a8243cd04546d9a09ad6af7ce"

RPROVIDES:${PN} += "libnetfilter-cttimeout-devel \
pkgconfig-libnetfilter-cttimeout"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-cttimeout1"

inherit rpm
