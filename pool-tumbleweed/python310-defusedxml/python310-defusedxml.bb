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

RPM_NAME = "python310-defusedxml-0.7.1-3.3.noarch.rpm"
RPM_HASH = "5fb16a423d0c9ea7f6bc47bd1e90cac1a7dd99a32d3678a053368847a564fac6c9071f0ad19d014a3615cb77d9610528198afe67927bb5b5f0b195476af66d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-defusedxml \
python310-defusedxml \
python3dist-defusedxml"

RDEPENDS:${PN} += "python-abi \
python310-xml"

inherit rpm
