SUMMARY = "Library for package, patch, pattern and product management"
DESCRIPTION = "libzypp is the package management library that powers applications \
like YaST, zypper and the openSUSE/SLE implementation of PackageKit. \
 \
libzypp provides functionality for a package manager: \
 \
  * An API for package repository management, supporting most common \
    repository metadata formats and signed repositories. \
  * An API for solving packages, products, patterns and patches \
    (installation, removal, update and distribution upgrade \
    operations) dependencies, with additional features like locking. \
  * An API for commiting the transaction to the system over a rpm \
    target. Supporting deltarpm calculation, media changing and \
    installation order calculation. \
  * An API for browsing available and installed software, with some \
    facilities for programs with an user interface."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.19"

RPM_NAME = "libzypp-17.31.19-1.2.aarch64.rpm"
RPM_HASH = "fad250127db6c97d9e643adfbea69238ebe75d2d1e30b8846d4f3ce5c3d8cfa844a7c70d84720034635a9c85a4baeaf8f4e4c44b228e490397483d8540b4161d"

RPROVIDES:${PN} += "config-libzypp \
libzypp \
libzypp-plugin \
libzypp-plugin-appdata \
libzypp-plugin-commit \
libzypp-plugin-repoverification \
libzypp-plugin-services \
libzypp-plugin-system \
libzypp-plugin-urlresolver \
libzypp-repovarexpand \
libzypp.so.1722 \
yast2-packagemanager"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libcurl4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpgme.so.11 \
libprotobuf-lite.so.23.4.0 \
libproxy.so.1 \
librpm.so.9 \
librpmio.so.9 \
libsigc-2.0.so.0 \
libsolv-tools \
libstdc++.so.6 \
libudev.so.1 \
libxml2.so.2 \
libyaml-cpp.so.0.8 \
libz.so.1 \
libzck.so.1 \
libzstd.so.1 \
rpm"

inherit rpm
