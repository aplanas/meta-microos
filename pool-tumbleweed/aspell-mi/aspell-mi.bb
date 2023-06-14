SUMMARY = "Maori (Māori) Dictionary for Aspell"
DESCRIPTION = "A Maori (Māori) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-mi-0.50-2.14.aarch64.rpm"
RPM_HASH = "80a93397d637fa22397ac835fc8cbfe087d7bbd5ae82a9dcd73ed7dee9aa2ae836b2950f37131888f1ca86bbe6cfe6f31066abae15f5f4375ffeb5c2fd5138aa"

RPROVIDES:${PN} += "aspell-mi \
locale-aspell-mi"

RDEPENDS:${PN} += ""

inherit rpm
