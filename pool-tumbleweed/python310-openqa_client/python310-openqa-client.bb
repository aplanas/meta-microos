SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python310-openqa_client-4.2.1-1.3.noarch.rpm"
RPM_HASH = "544ddcfe295435391c7b91389478a4e6b6bdec34a0e32e794650fa386745a97ce6f8599049a5ad6046cfb2aa82c70e4a7566c34205d1361563e8354afa32b919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openqa_client \
python3.10dist(openqa-client) \
python310-openqa_client \
python3dist(openqa-client)"

RDEPENDS:${PN} += "python(abi) \
python310-PyYAML \
python310-requests \
python310-typing_extensions"

inherit rpm
