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

RPM_NAME = "python39-defusedxml-0.7.1-3.1.noarch.rpm"
RPM_HASH = "c9d62e82438a361f486133ce4ebefa55f7a86f845fa89d70504572535439e210a41b5a16cf523660b977abf4ace8bd134c804d3aaa707e285cdca9a96b0ef660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-defusedxml \
python39-defusedxml \
python3dist-defusedxml"

RDEPENDS:${PN} += "python-abi \
python39-xml"

inherit rpm
