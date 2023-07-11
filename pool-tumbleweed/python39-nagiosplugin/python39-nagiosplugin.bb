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

RPM_NAME = "python39-nagiosplugin-1.3.3-1.5.noarch.rpm"
RPM_HASH = "c884bd436e3eb5eb1e9b8f486d21b95b489e1c7374794a3ee97aa4471981523a42950697eea40feeeff53748b205e29e106e9f8571a165095a503301f9e21755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nagiosplugin \
python39-nagiosplugin \
python3dist-nagiosplugin"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
