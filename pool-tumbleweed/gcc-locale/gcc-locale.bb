SUMMARY = "The system GNU Compiler locale files"
DESCRIPTION = "The system GNU Compiler locale files."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-locale-13-1.5.aarch64.rpm"
RPM_HASH = "861bb3e888a027a58164d9e983bbce531bfec5a375a781a0d451d21f5577d4fcf5dacdc85b5763234e80fc5dddc36a766247f000ed706253aa0c0e4654d8fc62"

RPROVIDES:${PN} += "gcc-locale"

RDEPENDS:${PN} += "gcc13-locale"

inherit rpm
