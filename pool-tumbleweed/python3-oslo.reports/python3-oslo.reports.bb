SUMMARY = "OpenStack oslo.reports library"
DESCRIPTION = "The project oslo.reports hosts a general purpose error report generation \
framework, known as the 'guru meditation report'."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python3-oslo.reports-2.4.0-1.5.noarch.rpm"
RPM_HASH = "d3de9c9967d694b0888d91032a3ad32101a53af2cf400325d595c61b8b63f3d78a1d068ce9c784ac0e136819650e37da3761d5dd5f86f1ce58d7f7260a49ff87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.reports \
python3.11dist-oslo.reports \
python3dist-oslo.reports"

RDEPENDS:${PN} += "python-abi \
python3-Jinja2 \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-psutil"

inherit rpm
