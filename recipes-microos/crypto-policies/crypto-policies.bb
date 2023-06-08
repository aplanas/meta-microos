SUMMARY = "System-wide crypto policies"
DESCRIPTION = "This package provides pre-built configuration files with \
cryptographic policies for various cryptographic back-ends, \
such as SSL/TLS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "20210917.c9d86d1"

RPM_NAME = "crypto-policies-20210917.c9d86d1-1.14.noarch.rpm"
RPM_HASH = "866a4bb2b6d546182ba2ae75f6285eb0abb4abe289c88595aca9b72faa750db172d43a84a8cb0df55be398fa41a456c2f5860b2109407c49e2d4ef6759767771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(crypto-policies) crypto-policies"
RDEPENDS:${PN} += ""

inherit rpm
