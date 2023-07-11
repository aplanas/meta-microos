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

PV = "17.31.15"

RPM_NAME = "libzypp-17.31.15-1.2.aarch64.rpm"
RPM_HASH = "044c6395b5b807cb99997fa65b6e49fcc254ada8a2b68e9b3aa5366a96e1fa4633ca654d09d1a2e6e7c24f0c1a25d702ab384c9b2619eba5670ba926573acbfa"

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
libprotobuf-lite.so.23.3.0 \
libproxy.so.1 \
librpm.so.9 \
librpmio.so.9 \
libsigc-2.0.so.0 \
libsolv-tools \
libstdc++.so.6 \
libudev.so.1 \
libxml2.so.2 \
libyaml-cpp.so.0.7 \
libz.so.1 \
libzck.so.1 \
libzstd.so.1 \
rpm"

inherit rpm
