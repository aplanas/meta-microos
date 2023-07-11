SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-power-1.4-3.15.noarch.rpm"
RPM_HASH = "0546efffd5c8b519cf8367890be2dc0a668939e478fc1c256c7f16c1d4a82f04b77378f6e390aac4b2b273ab7670d826d97575be587a592d31846357b69e933f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-power \
python310-power \
python3dist-power"

RDEPENDS:${PN} += "python-abi"

inherit rpm
