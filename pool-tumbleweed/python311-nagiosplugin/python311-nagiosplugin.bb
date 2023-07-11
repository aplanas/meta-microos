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

RPM_NAME = "python311-nagiosplugin-1.3.3-1.5.noarch.rpm"
RPM_HASH = "c4d7f815ee4056ed61c61ac72b149b4ccd2127b72230a3fc2c57ade94532b981466e13cbada685cb9c51da548e52c8f10358e909c2dc123f96a4f5aace6352a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nagiosplugin \
python3.11dist-nagiosplugin \
python311-nagiosplugin \
python3dist-nagiosplugin"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
