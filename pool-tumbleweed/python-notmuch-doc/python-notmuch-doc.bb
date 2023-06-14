SUMMARY = "Documentation of Python bindings for notmuch"
DESCRIPTION = "Documentation of Python interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "python-notmuch-doc-0.37-2.4.aarch64.rpm"
RPM_HASH = "69868c77fa0f461ce41c4a67ca5f6ef980f774e93a095956677a1a1be6b854ae3102c07fce5f959cb39c9830639f8060818a1d59ca7009bb8fb084129ece049b"

RPROVIDES:${PN} += "python-notmuch-doc"

RDEPENDS:${PN} += ""

inherit rpm
