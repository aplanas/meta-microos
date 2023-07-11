SUMMARY = "A general-purpose stream processing framework"
DESCRIPTION = "Aina is a general-purpose stream processing framework. It includes a \
templating system which powers a command line utility."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "python310-aina-0.1.3-4.11.noarch.rpm"
RPM_HASH = "5b120a42dc4b938ab9a6865ec0618294ec1b19dce21f4f9cfd53a7eccf65e9b576027932abd8ce8bf48d3e94e760352fde0ebaa6e9c4b64e36a63027beb1bb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aina \
python310-aina \
python3dist-aina"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base \
python310-click \
update-alternatives"

inherit rpm
