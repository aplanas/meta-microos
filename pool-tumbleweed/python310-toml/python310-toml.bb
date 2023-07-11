SUMMARY = "Python module which parses and emits TOML"
DESCRIPTION = "Python toml allows to parse and create toml configuration files. \
See below the toml specification link. \
 \
Usage \
toml.loads --- takes a string to be parsed as toml and returns \
the corresponding dictionary \
toml.dumps --- takes a dictionary and returns a string which \
is the contents of the corresponding toml file. \
 \
There are other functions which can be used to dump and load various \
fragments of toml but dumps and loads will cover most usage. \
 \
Current Version of TOML Specification \
https://github.com/mojombo/toml/blob/v0.4.0/README.md"
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python310-toml-0.10.2-3.2.noarch.rpm"
RPM_HASH = "28cfcf8340d2e39ca80d06da598f5539f1898d9b6e5063eba39f2c216b00d0b73d17d3181f5168d9044fd98651520b7cbc490660fdbd58fc37fcac85d9e32211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-toml \
python310-toml \
python3dist-toml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
