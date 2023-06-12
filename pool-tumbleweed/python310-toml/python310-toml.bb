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

RPM_NAME = "python310-toml-0.10.2-3.1.noarch.rpm"
RPM_HASH = "e250b3c15c5dd5f005b7a7dfeac56a4ef882d651a86ffe367b71e14200aa2a4b9c4aeed1ebf0c8285d0decae9688aa042cd121c9f077c55c0ebd10cce1c26efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toml \
python3.10dist(toml) \
python310-toml \
python3dist(toml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
