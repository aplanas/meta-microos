SUMMARY = "CLI utility to build and manage a PKI CA"
DESCRIPTION = "easy-rsa is a CLI utility to build and manage a Public Key Infrastructure \
(PKI). Once the Certificate Authority (CA) is created, you can request and sign \
certificates, including sub-CAs, and create Certificate Revokation Lists (CRL)."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.2"

RPM_NAME = "easy-rsa-3.1.2-1.1.noarch.rpm"
RPM_HASH = "dd348f1b072bd6c0f480ef4ddc65e8133a53122149cca4792366b2a33a119abfd6cde5fa5bbeb95b8a6d275d6eb4eae33eeaf537589cbe6d34f922c6bf4e7050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-easy-rsa \
easy-rsa"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
