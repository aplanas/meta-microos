SUMMARY = "Data files for use with LAL Pulsar"
DESCRIPTION = "This package provides auxiliary data useful for analyses with LAL Pulsar."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "lalpulsar-data-5.0.0-1.3.noarch.rpm"
RPM_HASH = "1b8add645065a4d4a4bb621af18569d974ded77a81d36586b88528340f27a34276c2ba7198a71b1487a51d449e1a044abb447c0f08b109a784b827ccd9476454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lalpulsar-data"

RDEPENDS:${PN} += ""

inherit rpm
