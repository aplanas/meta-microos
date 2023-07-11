SUMMARY = "Python library for kaitaistruct"
DESCRIPTION = "This library implements the Kaitai Struct API for Python. \
 \
Kaitai Struct is a declarative language used to describe various binary data \
structures, laid out in files or in memory: i.e. binary file formats, network \
stream packet formats, etc. \
 \
It is similar to Python’s [construct] and [Construct3], but it is \
language-agnostic. \
The format description is done in YAML-based .ksy format, which then can be \
compiled into a wide range of target languages."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python311-kaitaistruct-0.10-1.5.noarch.rpm"
RPM_HASH = "8afba73d0564555dcad2803603e4702f7d6724d75a036d1e419c1602d56be7a524e2ac0fb7d395275cd3c00a541aa9d6f7af9da0b251c09377cd582d323009ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kaitaistruct \
python3.11dist-kaitaistruct \
python311-kaitaistruct \
python3dist-kaitaistruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
