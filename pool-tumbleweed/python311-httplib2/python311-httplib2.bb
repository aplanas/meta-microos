SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.22.0"

RPM_NAME = "python311-httplib2-0.22.0-3.1.noarch.rpm"
RPM_HASH = "4dc80d6482af2412414489ec8fcc5723627517584a6609657dc86dc0ca446fbff49c3dd386668030f36ae2fb7785d9a8e896299d69a82c23d73797bf0ed1362a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httplib2 \
python3.11dist-httplib2 \
python311-httplib2 \
python3dist-httplib2"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python311-certifi \
python311-pyparsing"

inherit rpm
