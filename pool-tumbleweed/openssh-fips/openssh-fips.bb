SUMMARY = "OpenSSH FIPS crypto module HMACs"
DESCRIPTION = "This package contains hashes that, together with the main openssh packages, \
form the FIPS certifiable crypto module."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p1"

RPM_NAME = "openssh-fips-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "521a3d53c132bf40811f0415bfc4674305f216bfde2ebcf2c2766d34bfcc0988d423a78396a36593f4f2e8b25125404b546d9e1bfdc5aba875a1ec82bc2bcab7"

RPROVIDES:${PN} += "openssh-fips"

RDEPENDS:${PN} += "/usr/bin/sh \
openssh-common"

inherit rpm
