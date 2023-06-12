SUMMARY = "leechcraft_media"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_media-20170319-1.15.aarch64.rpm"
RPM_HASH = "859ea3f0cd22ae8e7cdd4c38eaddecf43ddaf3dc8466a2cb60f75318bdeca4ef6813d5872a9debe59576baa39327e95769106fb7d8cd5cc6641f4c8149ee5d06"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-leechcraft-leechcraft_media \
patterns-leechcraft-leechcraft_media(aarch-64)"
RDEPENDS:${PN} += "leechcraft-lmp \
pattern()"

inherit rpm
