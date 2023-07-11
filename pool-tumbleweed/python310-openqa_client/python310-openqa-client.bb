SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python310-openqa_client-4.2.1-1.5.noarch.rpm"
RPM_HASH = "53385facd01e36d3c34a8b58689c3b5791df4c5f3d9ce88b535345c49e8e594956a940adbda0aca1f7f58f0d873ff8068c7e9002548e562d014418b980a93012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openqa-client \
python310-openqa-client \
python3dist-openqa-client"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-requests \
python310-typing-extensions"

inherit rpm
