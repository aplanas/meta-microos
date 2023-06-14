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

RPM_NAME = "python39-toml-0.10.2-3.1.noarch.rpm"
RPM_HASH = "ec076f887a2633f99339a935da754afaf34c06aa9fde8ee6a24d5ed9286fb3975fdf1be201bcd9145b673788ea725cd6515eb212691d97fda0548c5541d75ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-toml \
python39-toml \
python3dist-toml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
