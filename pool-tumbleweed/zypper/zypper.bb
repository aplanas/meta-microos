SUMMARY = "Command line software manager using libzypp"
DESCRIPTION = "Zypper is a command line tool for managing software. It can be used to add \
package repositories, search for packages, install, remove, or update packages, \
install patches, hardware drivers, verify dependencies, and more. \
 \
Zypper can be used interactively or non-interactively by user, from scripts, \
or front-ends. \
 \
Authors: \
-------- \
    Jan Kupec <jkupec@suse.cz> \
    Michael Andres <ma@suse.de> \
    Duncan Mac-Vicar <dmacvicar@suse.de> \
    Martin Vidner <mvidner@suse.cz> \
    Josef Reidinger <jreidinger@suse.cz>"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.62"

RPM_NAME = "zypper-1.14.62-1.1.aarch64.rpm"
RPM_HASH = "98a6f22c8ed59574cca1e62ec346ed9088c8dc9278246f5dab86bb28a9b7740f28aa30518733947051c18914739bfb120e28f741ccd41cc33309a45cb4b49fad"

RPROVIDES:${PN} += "config-zypper \
y2pmsh \
zypper \
zypper-auto-agree-with-product-licenses \
zypper-oldpackage \
zypper-purge-kernels \
zypper-updatestack-only"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libaugeas0 \
libc.so.6 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6 \
libxml2.so.2 \
libzypp \
libzypp.so.1722 \
procps"

inherit rpm
