SUMMARY = "Javadoc for ongres-scram"
DESCRIPTION = "This package contains javadoc for ongres-scram"
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-javadoc-2.1-2.11.noarch.rpm"
RPM_HASH = "80f7c0d99953597466ff45434c4c251c947b9dac8c96c9f28b4b13ff0eafb4303a4200a8561bad045569f3525f43579a1f69d7b84ef4cf28aafcda28117ecf9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ongres-scram-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
