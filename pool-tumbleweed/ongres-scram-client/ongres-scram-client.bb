SUMMARY = "Client for ongres-scram"
DESCRIPTION = "This package contains the client for ongres-scram"
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-client-2.1-2.10.noarch.rpm"
RPM_HASH = "bdfa8e5a1e6e8ac377da1723dd6eb4c46db1d98298cd2db669cf137913f00e5164943bdf00f61c3ebffab091f44bb4c898e9afb59856d9fcf276655ebc75836c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.ongres.scram:client) \
mvn(com.ongres.scram:client:pom:) \
ongres-scram-client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.ongres.scram:common)"

inherit rpm
