SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-hanzidentifier-1.1.0-2.3.noarch.rpm"
RPM_HASH = "b13ee24edf902feb5601381049da693c7143a7ea5bbf6ba11572047f0bac75eaaf32ed8a14e07c668f7a022d3108a7154bb87bebec2bc7e46ef7ff77089e2967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hanzidentifier \
python310-hanzidentifier \
python3dist-hanzidentifier"

RDEPENDS:${PN} += "python-abi \
python310-zhon"

inherit rpm
