SUMMARY = "System-wide crypto policies"
DESCRIPTION = "This package provides pre-built configuration files with \
cryptographic policies for various cryptographic back-ends, \
such as SSL/TLS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "20230420.3d08ae7"

RPM_NAME = "crypto-policies-20230420.3d08ae7-1.1.noarch.rpm"
RPM_HASH = "0db1e15dd0a9d42cce8991ffa2862277bf768d10fadc805d103230f2036a275e72adcd3bf3ea4d278abd6c8f6b361bcd5a30532c627fb081287f384a62bd16ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(crypto-policies) \
crypto-policies"

RDEPENDS:${PN} += ""

inherit rpm
