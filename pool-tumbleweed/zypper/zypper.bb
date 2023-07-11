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

PV = "1.14.61"

RPM_NAME = "zypper-1.14.61-1.1.aarch64.rpm"
RPM_HASH = "ceb1e07c323ca6ad2e710b9b7cae89273a3ed8a41b1f4d6201495b49d7740390c1cf6cc017d5050c8b0d4ca9a39ce4b7600f04aa429fe89912184d5402034a24"

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
