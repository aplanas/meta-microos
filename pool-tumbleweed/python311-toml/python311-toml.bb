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

RPM_NAME = "python311-toml-0.10.2-3.2.noarch.rpm"
RPM_HASH = "39b84602167a027af522fa33fdd857ea44171eda85435d9ddc498a2d156a4f64ae0ef20e7935b179e46aa8489479309046f1b19737314c0dbf7c16ff71a7869e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toml \
python3.11dist-toml \
python311-toml \
python3dist-toml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
