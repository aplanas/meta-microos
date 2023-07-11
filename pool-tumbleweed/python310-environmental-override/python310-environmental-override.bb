SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-environmental-override-0.1.2-1.18.noarch.rpm"
RPM_HASH = "5a6a1cc020e577a30871e45f23a4572b81cb7fbce4303ee76c2b2307088910b05f9d148a09628987ae349cd6612b91b436fd70bb87083dd386fc8cc48bb3a5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-environmental-override \
python310-environmental-override \
python3dist-environmental-override"

RDEPENDS:${PN} += "python-abi"

inherit rpm
