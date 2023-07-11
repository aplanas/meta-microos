SUMMARY = "Command-line utility for vkBasalt"
DESCRIPTION = "vkbasalt-cli (filename vkbasalt) is a CLI utility and library in conjunction with vkBasalt. This makes generating configuration files or running vkBasalt with games easier. This is mainly convenient in environments where integrating vkBasalt is wishful, for example a GUI application. Integrating vkbasalt-cli allows a front-end to easily generate and use specific configurations on the fly, without asking the user to manually write a configuration file"
LICENSE = "LGPL-3.0-only"

PV = "3.1.1"

RPM_NAME = "vkbasalt-cli-3.1.1-1.1.noarch.rpm"
RPM_HASH = "e52cb83217acff02867e4ac47dbcd2bbdc27f5782a22733c16b1acdc495f7f925b915e7313f1afe804881ff7aa0b853144f9aa317f892abbc23cced96eec58cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-vkbasalt-cli \
python3dist-vkbasalt-cli \
vkbasalt-cli"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi"

inherit rpm
