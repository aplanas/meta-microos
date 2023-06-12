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

RPM_NAME = "python311-kaitaistruct-0.10-1.3.noarch.rpm"
RPM_HASH = "9b4e0606a006d354d943855dc2efa55a3b7b61a2108dd6858e2a967349f942e4a7a6979367247a8ca3f0d7163a1fc2bbcdd6d3ab7174f23fe00073673380d7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kaitaistruct) \
python311-kaitaistruct \
python3dist(kaitaistruct)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
