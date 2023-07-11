SUMMARY = "XML bomb protection for Python stdlib modules"
DESCRIPTION = "The results of an attack on a vulnerable XML library can be fairly dramatic. \
With just a few hundred bytes of XML data an attacker can occupy several \
gigabytes of memory within seconds. An attacker can also keep \
CPUs busy for a long time with a small to medium size request. \
 \
This library allows for XML to be parsed in a manner that avoids these \
pitfalls."
LICENSE = "Python-2.0"

PV = "0.7.1"

RPM_NAME = "python311-defusedxml-0.7.1-3.3.noarch.rpm"
RPM_HASH = "643fdf3c93ff692a44f049d909676de80c2327c7523be31c2df83b86313ba007480a91ac1ea65b002a497fd3d4dbc4f899a607dbb0fe4e8131754154eacfffaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-defusedxml \
python3.11dist-defusedxml \
python311-defusedxml \
python3dist-defusedxml"

RDEPENDS:${PN} += "python-abi \
python311-xml"

inherit rpm
