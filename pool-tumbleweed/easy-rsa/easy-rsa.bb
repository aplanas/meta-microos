SUMMARY = "CLI utility to build and manage a PKI CA"
DESCRIPTION = "easy-rsa is a CLI utility to build and manage a Public Key Infrastructure \
(PKI). Once the Certificate Authority (CA) is created, you can request and sign \
certificates, including sub-CAs, and create Certificate Revokation Lists (CRL)."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.5"

RPM_NAME = "easy-rsa-3.1.5-1.1.noarch.rpm"
RPM_HASH = "45a574be0ad328a5c2fb54c64a5140693630f56ccc43e563db00840669d8440b0629f33f43653133dc35f9bfee2814ca8aea914d307b200f91c11a0756218d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-easy-rsa \
easy-rsa"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
