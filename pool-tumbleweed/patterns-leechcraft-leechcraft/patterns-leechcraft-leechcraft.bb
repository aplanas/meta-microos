SUMMARY = "leechcraft"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft-20170319-1.15.aarch64.rpm"
RPM_HASH = "fa2d1ca4661d7bfc99b1e1e95d475a97d8f5eb1de3fe77714232a186bffb21f1e8036699f2e6260a6da96cc33dc5631f0852aefb0f3a9b34ade47de685adea03"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft"

RDEPENDS:${PN} += "leechcraft-cstp \
pattern-"

inherit rpm
