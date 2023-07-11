SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python311-langtable-0.0.61-2.2.noarch.rpm"
RPM_HASH = "cac973acba3b7ec0464f2bdca34879db7155a53dd1ac94b15fbc97e7e9ed552dd9176dfa17cf78581fba516fe66484a0cde26d83d416489418503369caadb535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langtable \
python3.11dist-langtable \
python311-langtable \
python3dist-langtable"

RDEPENDS:${PN} += "python-abi \
python-langtable-data"

inherit rpm
