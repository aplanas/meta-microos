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
LICENSE = "GPL-2.0+"

PV = "1.14.60"

RPM_NAME = "zypper-1.14.60-1.1.aarch64.rpm"
RPM_HASH = "ce2d8f20fb1798b029e9baf6005a7fb96b6a7ac402a5bba36c8455b4479f4e0d9cecd5096d6af6cdb5f06047b690181547967cfdf52417689997df7f69c11ab1"

RPROVIDES:${PN} += "config(zypper) \
y2pmsh \
zypper \
zypper(aarch-64) \
zypper(auto-agree-with-product-licenses) \
zypper(oldpackage) \
zypper(purge-kernels) \
zypper(updatestack-only)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libaugeas.so.0()(64bit) \
libaugeas0 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libzypp \
libzypp.so.1722()(64bit) \
libzypp.so.1722(ZYPP_plain)(64bit) \
procps"

inherit rpm
