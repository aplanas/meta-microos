SUMMARY = "OpenSSH FIPS crypto module HMACs"
DESCRIPTION = "This package contains hashes that, together with the main openssh packages, \
form the FIPS certifiable crypto module."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p2"

RPM_NAME = "openssh-fips-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "469d8dd7c60dd12b8403a6225fb6b645315dc254e737ee69be5dfefa26985175c9bb051bff3290ff7985b7b720831bfa5d353b947c7ad5890d03df2aede0a47e"

RPROVIDES:${PN} += "openssh-fips"

RDEPENDS:${PN} += "/usr/bin/sh \
openssh-common"

inherit rpm
