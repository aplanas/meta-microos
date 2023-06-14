SUMMARY = "Data files for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides data files needed by it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-data-2.0.99.2-2.2.aarch64.rpm"
RPM_HASH = "afa72ae88283041352c0f831a4e887885fa1c46625d6c4536395530f98755ad3082bddfb78279b6241b773a8ab5051ec198a85aecc20fe6b65dddf451796f989"

RPROVIDES:${PN} += "sunpinyin-data"

RDEPENDS:${PN} += ""

inherit rpm
