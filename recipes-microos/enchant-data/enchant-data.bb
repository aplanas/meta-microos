SUMMARY = "Data files for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides data/configuration files for libenchant."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-data-2.2.15-3.3.aarch64.rpm"
RPM_HASH = "dadaeb9c9551fca838ba77dbd0b4aec7c558b64dd19b3baac4eddc20bd2ec4071fd0c2fcdb50288e19173f8a6b58e8033c9ff69b4fc1a9efebd2df3de077cb16"

RPROVIDES:${PN} += "enchant-data enchant-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
