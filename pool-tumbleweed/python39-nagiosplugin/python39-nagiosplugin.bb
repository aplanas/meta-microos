SUMMARY = "Class library for writing Nagios (Icinga) plugins"
DESCRIPTION = "nagiosplugin is a Python class library which helps writing Nagios (or Icinga) \
compatible plugins in Python. It cares for much of the boilerplate code \
and default logic commonly found in Nagios checks, including: \
 \
- Nagios 3 Plugin API compliant parameters and output formatting \
- Full Nagios range syntax support \
- Automatic threshold checking \
- Multiple independent measures \
- Custom status line to communicate the main point quickly \
- Long output and performance data \
- Timeout handling \
- Persistent 'cookies' to retain state information between check runs \
- Resumption of log file processing at the point where the last run left off \
- No dependencies beyond the Python standard library"
LICENSE = "ZPL-2.1"

PV = "1.3.3"

RPM_NAME = "python39-nagiosplugin-1.3.3-1.3.noarch.rpm"
RPM_HASH = "3c846482f3866b1658123abb222242b1add1a7cada33263580dc521453ce04bd5bca27bd7218a922963cc16744403f69a0b39168455a629a9faa1ebd0dbc08ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nagiosplugin \
python39-nagiosplugin \
python3dist-nagiosplugin"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
