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

RPM_NAME = "python39-defusedxml-0.7.1-3.3.noarch.rpm"
RPM_HASH = "ec072baa7bc24918a635b6d53d8176fefd9adc1cad52b46e925b91dee9cc44628222c422059bccdfcf8b6932ebb4dea32ed7135cd7c3f9ab1196399e7d2decfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-defusedxml \
python39-defusedxml \
python3dist-defusedxml"

RDEPENDS:${PN} += "python-abi \
python39-xml"

inherit rpm
