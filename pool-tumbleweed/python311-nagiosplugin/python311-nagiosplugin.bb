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

RPM_NAME = "python311-nagiosplugin-1.3.3-1.3.noarch.rpm"
RPM_HASH = "6e7955d025b39b89b03ebb83f7974c0509dbf9d894499ba990a5278292b6b9ae587b218b3476d6b38947b707314c066eea75db2fef360cc722106b10e75dff89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nagiosplugin) \
python311-nagiosplugin \
python3dist(nagiosplugin)"
RDEPENDS:${PN} += "python(abi) \
python311-setuptools"

inherit rpm
