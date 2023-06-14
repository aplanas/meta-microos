SUMMARY = "Site Paths Configuration for autoconf Based configure Scripts"
DESCRIPTION = "Site configuration for autoconf based configure scripts provides smart \
defaults for paths that are not specified."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "site-config-0.2-14.4.aarch64.rpm"
RPM_HASH = "1ce6eda502dd2186641ad6fad01298e69213317cfd7814a1a2b58086f95d301232f2a652a2c165bc8ccdea608c4c0ba6764f6c770694a86e858a3767ac4eeca7"

RPROVIDES:${PN} += "site-config"

RDEPENDS:${PN} += ""

inherit rpm
