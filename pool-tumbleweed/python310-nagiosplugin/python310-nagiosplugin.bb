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

RPM_NAME = "python310-nagiosplugin-1.3.3-1.5.noarch.rpm"
RPM_HASH = "b23ef423fc31eae1500d272919bd607d38c97fe68571282337cb75e3e14472f55def668fcab32e1f7f5a09944e2bb18c34bd750a0e464f01c4e2faaea0925742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nagiosplugin \
python310-nagiosplugin \
python3dist-nagiosplugin"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
