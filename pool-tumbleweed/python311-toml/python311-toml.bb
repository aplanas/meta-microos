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

RPM_NAME = "python311-toml-0.10.2-3.1.noarch.rpm"
RPM_HASH = "f0fdce4bb6e4abef281d9b23ab992d486864639b2e4ac5155330c6b428f312c745a66e0e7cb2919630777e13d615f45d650e7b7440f1cbaa2b8dfa96b9087775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(toml) \
python311-toml \
python3dist(toml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
