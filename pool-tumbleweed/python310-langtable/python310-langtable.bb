SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python310-langtable-0.0.61-2.2.noarch.rpm"
RPM_HASH = "e3c63da676a7ea82402447a76ab5986ed9b225bf35d3650a019905fce2f26633e8cbb6572193c6c4fef204a5df27de3c27c314b8b8565a0ff5dccaf695ce0fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-langtable \
python310-langtable \
python3dist-langtable"

RDEPENDS:${PN} += "python-abi \
python-langtable-data"

inherit rpm
