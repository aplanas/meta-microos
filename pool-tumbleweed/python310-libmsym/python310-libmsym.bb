SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python310-libmsym-0.2.3-2.6.noarch.rpm"
RPM_HASH = "5ab87786cd451b6cd66eea7d61f03b3fa3ee553198aa76d98793c6ddabec2b46d5465be3b8a7cca8991b362eae02fb65ae7f0f69909361b2139b679ad307f5cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-libmsym \
python310-libmsym \
python3dist-libmsym"

RDEPENDS:${PN} += "python-abi"

inherit rpm
